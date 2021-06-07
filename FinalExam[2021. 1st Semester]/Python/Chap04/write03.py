outfile = open('text.txt', 'w')

a = outfile.write('T')
print(a)

a = outfile.write('his is the first line.')
print(a)

a = outfile.write('Still the first line ...\n')
print(a)

a = outfile.write('Now we are in the second line.\n')
print(a)

a = outfile.write('Non string value like ' + str(5) + ' must be converted first.\n')
print(a)

a = outfile.write('Non string value like {} must be converted first.\n'.format(5))
print(a)

outfile.close()