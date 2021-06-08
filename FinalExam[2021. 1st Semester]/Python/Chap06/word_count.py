c = input('문자열 입력')
st = set(c)

for i in st:
    cnt = 0
    for n in c:
        if i == n:
            cnt += 1
    print(i, ':', cnt, '회')
    