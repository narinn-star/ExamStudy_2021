fname = input("파일명 입력 : ")
fp = open(fname, 'r')

line = 0
for stLine in fp:
    line += 1
    print('\n<<< line', line, '>>>', stLine.strip())
    st = set(stLine)

    for k in st:
        if k == ' ' or k == '\n':
            continue
        i = 0
        for n in stLine:
            if k == n:
                i += 1
        print(k + ':' + str(i), end='; ')
    print()

fp.close()