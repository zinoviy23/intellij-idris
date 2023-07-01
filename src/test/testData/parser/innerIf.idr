c : Bool -> Bool -> Int
c f1 f2 = if
    f1
    then
    if
        f2
        then
        10
        else
        13
    else
    12


c1 : Bool -> Bool -> Int
c1 f1 f2 = if
            f1
            then
            if
            f2
            then
            21
            else
            22
            else
            23