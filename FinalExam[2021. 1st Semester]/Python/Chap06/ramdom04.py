import random

user = int(input('사용자 수 선택: '))

com = random.randrange(2)

if com == 0:
    cres = "홀"
else:
    cres = "짝"

if user % 2 != 0:
    ures = "홀"
else:
    ures = "짝"

print('사용자 : ', user, '\t 컴퓨터 : ', cres, '\t ====>  ', end='')

if cres == ures:
    print("컴퓨터 승")
else:
    print("사용자 승")   