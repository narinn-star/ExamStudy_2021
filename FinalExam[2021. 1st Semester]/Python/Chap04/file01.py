ifp = open('song.txt', 'r')
ofp = open('songWord.txt', 'a')

for fline in ifp:
    line = fline.strip()
    wordList = line.split()

    for word in wordList:
        ofp.write(word + '\n')

ifp.close()
ofp.close()