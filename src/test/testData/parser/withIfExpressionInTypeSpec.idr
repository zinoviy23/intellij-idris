myF : (a : Bool) -> (if a then String else Int) -> Int
myF True str = cast str
myF False int = int