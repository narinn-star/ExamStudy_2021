def double(y):
    x = 2
    print('x = {}, y = {}'.format(x, y))
    return x*y

def f(b):
    # global a
    # a = 6
    return a*b

a = 0
print('f(3) = {}'.format(f(3)))
print('a is {}'.format(a))