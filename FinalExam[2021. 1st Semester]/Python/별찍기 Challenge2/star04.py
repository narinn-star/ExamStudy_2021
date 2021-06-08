# *********
#  *******
#   *****
#    ***
#     *

for i in range(5):
    for j in range(i):
        print(' ',end='')
    for j in range(9-i*2):
        print('*', end='')
    print()