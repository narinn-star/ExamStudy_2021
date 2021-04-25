import turtle
t = turtle.Pen()
t.shape("turtle")

def triangle():
    t.forward(100)
    t.left(120)
    t.forward(100)
    t.left(120)
    t.forward(100)
    t.left(120)
    t.forward(100)
    t.left(60)

for i in range(6):
    triangle()