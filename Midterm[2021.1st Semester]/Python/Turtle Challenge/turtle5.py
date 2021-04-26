import turtle
t = turtle.Pen()
t.shape("turtle")

t.forward(100)
t.right(120)
t.forward(200)
t.right(120)
t.forward(200)
t.right(120)
t.forward(100)

t.circle(100)
t.circle(100, extent = 60)
t.circle(100, steps = 3)

t.penup()
t.home()