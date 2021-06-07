def numChars(filename):
    infile = open(filename, 'r')
    content = infile.read()
    infile.close()

    print(len(content))

def numWords(filename):
    infile = open(filename, 'r')
    content = infile.read()
    infile.close()

    wordList = content.split()
    print(wordList)
    print(len(wordList))

def numLines(filename):
    infile = open(filename, 'r')
    lineList = infile.readlines()
    infile.close()

    print(lineList)
    print(len(lineList))

numChars('example.txt')
numWords('example.txt')
numLines('example.txt')

print("=============================")

infile = open('example.txt')
for line in infile:
    print(line, end='')
infile.close()