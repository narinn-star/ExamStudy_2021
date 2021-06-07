fp = open('song.txt', 'r')

print('<< song.txt 일부 읽기 >>')
c15 = fp.read(15)
print(c15)

print('<< song.txt 계속 읽기 >>')
next = fp.read()
print(next)

fp.close()
