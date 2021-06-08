for x in range(5):
    print(' ' * x, end='')
    for y in range(5 - x):
        print('*', end='')
    print()

# 1. 결과 그리기