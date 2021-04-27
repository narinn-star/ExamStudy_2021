def fib(n):
    f = [1,1]
    tmp = 0
    if n == 0 or n == 1:
        return f[n]
    else:
        for i in range(2,n+1):
            tmp = f[i-2] + f[i-1]
            f.append(tmp)
        return f[n]

print(fib(0))
print(fib(4))
print(fib(8))    
        