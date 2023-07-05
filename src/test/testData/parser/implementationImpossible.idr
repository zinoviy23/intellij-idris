implementation Uninhabited (Fin Z) where
  uninhabited FZ impossible
  uninhabited (FS f) impossible

a : Int
a = 10