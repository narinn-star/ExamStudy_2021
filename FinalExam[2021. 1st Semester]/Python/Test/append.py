x = []
p, n = 72, 2

while(p > 1):
    if p % n == 0:
        p //= n
        x.append(n)
    else:
        n += 1
   
print(x)