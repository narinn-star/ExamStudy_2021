infile = open('student.txt', 'r')
content = infile.readlines()
infile.close()
res = ''
for line in content:
    sname = line.split()[0]
    kor = line.split()[1]
    eng = line.split()[2]
    mat = line.split()[3]

    avg = round((int(kor) + int(eng) + int(mat)) / 3, 2)
    
    res += (sname + ' ' + str(avg) + '\n')
    

newfile = open('average.txt', 'w')
newfile.write(res)
newfile.close()