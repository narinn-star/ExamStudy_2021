def sub(x, y):
    global a
    
    a = 7
    x, y = y, x
    b = 3
    print(a, b, x, y)

a, b, x, y = 1, 2, 3, 4
print(a, b, x, y)   # 1, 2, 3, 4
sub(x, y)           # 7, 3, 4, 3
print(a, b, x, y)   # 7, 2, 3, 4