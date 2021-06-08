s = 'abcef'
res, i = '', 'a'

for a in s:
    if (ord(a) - ord(i)) % 2 == 0:
        res += chr(ord(a)+1)
    else:
        res += chr(ord(a)-1)

print(s , ' => ', res)

# 8. 결과 적기