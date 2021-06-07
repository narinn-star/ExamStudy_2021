with open('song.txt', 'r') as fr:
    rfile = fr.read()
    print(rfile)

print('Closed : ', fr.closed)