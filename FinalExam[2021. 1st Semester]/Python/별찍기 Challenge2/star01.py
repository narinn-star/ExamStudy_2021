#           *
#         ***
#       *****
#     *******
#   *********

for i in range(5):
    for j in range(9 - i * 2 - 1):
        print(" ", end='')
    for j in range(i * 2 + 1):
        print("*", end='')
    print()