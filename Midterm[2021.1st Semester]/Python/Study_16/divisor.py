num = int(input("정수 입력 : "))
print(num, "의 약수 : ", end='')
for i in range(1, num+1):
    if (num % i == 0):
        print(i, end=' ')