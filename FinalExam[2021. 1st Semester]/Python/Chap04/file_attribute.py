fp = open('foo.txt', 'w')

print('Name:', fp.name)
print('Mode:', fp.mode)
print('Closed:', fp.closed)

fp.close()
print('Closed:', fp.closed)