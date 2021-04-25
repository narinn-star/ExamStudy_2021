def ft(c):
    s = 'Beautiful Sunday'
    count = 0
    
    for i in range(len(s)):
        if s[i] == c:
            print(i+1, "번째", c, "발견")
            count += 1    
    print("총 문자 수 : ", count)

ch = input("찾는 문자 : ")
total = ft(ch)