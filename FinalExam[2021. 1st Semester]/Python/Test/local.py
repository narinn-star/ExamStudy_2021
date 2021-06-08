class Cnt:
    def __init__(self, cnt = 0):
        self.cnt = cnt

def fr(c, t):
    for i in range(10):
        c.cnt += 1
        t += 1

a = Cnt(10)
t = 10
fr(a, t)

print('a.cnt = ', a.cnt)
print('t = ', t)

# 10. 결과 적기