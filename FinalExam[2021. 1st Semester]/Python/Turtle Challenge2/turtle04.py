# 정사각형 + 원 내접
import turtle
t = turtle.Pen()
t.shape("turtle")

for i in range(4):
    t.forward(100)
    t.left(90)

t.forward(50)
t.circle(50)
t.forward(50)