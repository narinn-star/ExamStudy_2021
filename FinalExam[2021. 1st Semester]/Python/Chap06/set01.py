st3 = set() #  빈 집합 생시, set()함수 사용
print('st3 : ', st3, type(st3))
st3.add(11)
print('st3 : ', st3)

c = input("문자열 입력 : ")
st = set(c)

for k in st:
    i = 0
    for n in c:
        if k == n:
            i += 1
    print(k, ' : ', i, '회')

