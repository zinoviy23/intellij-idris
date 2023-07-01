package com.github.zinoviy23.intellijIdris.services

import com.intellij.openapi.application.EDT
import com.intellij.openapi.application.readAction
import com.intellij.openapi.components.Service
import com.intellij.openapi.components.service
import com.intellij.openapi.vfs.LocalFileSystem
import com.intellij.openapi.vfs.VirtualFile
import kotlinx.coroutines.*

@Service
class IdrisCliService(private val scope: CoroutineScope) {
    companion object {
        fun getInstance(): IdrisCliService = service()
    }

    private suspend fun runCommand(vararg command: String): String {
        return withContext(Dispatchers.IO) {
            val process = ProcessBuilder()
                .command(*command)
                .start()

            val code = runInterruptible {
                process.waitFor()
            }
            assert(code == 0)

            process.inputStream.reader(Charsets.UTF_8).readText().trim()
        }
    }

    fun getStdLibPath(callback: (VirtualFile) -> Unit) {
        scope.launch {
            val path = "/home/zinoviy23/Documents/libs"
            val file = readAction {
                LocalFileSystem.getInstance()
                    .refreshAndFindFileByPath(path)
            }!!

            withContext(Dispatchers.EDT) {
                callback(file)
            }
        }
    }
}