import random

x = random.choice('beautiful')
y = random.choice(['cat', 'dog', 'cow'])
print('선택된 문자:', x, '\t선택된 원소:', y)

x = random.choice('beautiful')
y = random.choice(['cat', 'dog', 'cow'])
print('선택된 문자:', x, '\t선택된 원소:', y)


x = random.sample(range(40), 10)
print(type(x), '\n',  'x = ', x)

coin = random.randrange(2)
if coin==0:
    print("앞면")
else:
    print("뒷면")