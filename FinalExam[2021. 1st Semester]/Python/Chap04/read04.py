fp = open('song.txt', 'r')

lines = fp.readlines()
print(lines)

print(lines[0])
print(lines[2])

fp.close()
