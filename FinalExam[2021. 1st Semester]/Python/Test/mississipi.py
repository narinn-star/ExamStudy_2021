c = 'mississippi'
st = set(c)

for i in st:
    cnt = 0
    for n in c:
        if i == n:
            cnt += 1
    print(i, ':', cnt)

# 9. 결과 적기