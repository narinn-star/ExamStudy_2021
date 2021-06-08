import turtle

t = turtle.Pen()
t.shape('hideturtle')

def tri():
    for i in range(4):
        t.forward(100)
        t.left(90)

for i in range(3):
    tri()
    t.right(90)

# 2. 결과 그리기