fp = open('song.txt', 'r')

line1 = fp.readline()
line2 = fp.readline()

print('< song.txt 한 줄 씩 읽기 >>')
print(line1)
print(line2)

fp.close()