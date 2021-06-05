# randrange(a, b) : a에서 b - 1 사이의 임의의 정수
# randint(a, b) : a에서 b 사이의 임의의 정수
# uniform(a, b) : a에서 b 사이의 임의의 정수
# random() : 0과 1사이의 임의의 실수
# shuffle(seq) : 주어진 순서열 seq를 임의의 순서로 섞음
# choice(seq) : 주어진 순서열 seq에서 임의의 한 개 선택
# sample(group, k) : 주어진 집단에서 임의의 다른 k개를 추출 list 구성

import random

a = int(input("1 ~ 10 정수 입력 : "))
x = random.randint(1,10)

if x == a:
    print('Success!')
else:
    print('Fail!')

n = 0
while n != 4:
    n = random.randint(0, 4)
    print(n)

x = random.random()
print(type(x), '\n', 'x = ', x)