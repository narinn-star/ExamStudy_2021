fp = open('song.txt', 'r')

for line in fp:
    st = line.rstrip() #'\n' 자르기
    print(st)

fp.close()