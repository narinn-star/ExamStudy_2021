x = []

def func(n):
    a, b = 1, 2
    while(a < n):
        x.append(a)
        a, b = b, a*b
    return x

print(func(200))

# ?. 결과 적기