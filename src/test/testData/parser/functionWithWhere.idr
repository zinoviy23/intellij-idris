module Main

average : (str : String) -> Double
average str = str
    where
        wordCount : String -> Nat
        wordCount str = length (words str)

        allLengths : List String -> List Nat
        allLengths strs = map length strs

showAverage : String -> String
showAverage str = "The average word length is: " ++ show (average str) ++ "\n"

main : IO ()
main = repl "Enter a string: " showAverage