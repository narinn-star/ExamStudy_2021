fp = open('song1.txt', 'w')

n = fp.write('Yesterday once more\nDust in the wind\n')
print(n, '문자 writing')

fp.close()