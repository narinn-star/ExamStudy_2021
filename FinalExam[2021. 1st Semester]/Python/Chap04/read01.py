fp = open('song.txt', 'r')

print('<< song.txt 전부 읽기 >>')
rfile = fp.read()
print(rfile)

print('<< song.txt 부분 읽기 [37:50] >>')
print(rfile[37:50])

fp.close()