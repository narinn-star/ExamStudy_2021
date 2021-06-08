# 정삼각형 * 6 => 정육각형
import turtle

t = turtle.Pen()
t.shape("turtle")

for i in range(6):
    t.forward(100)
    t.left(120)
    t.forward(100)
    t.left(120)
    t.forward(100)
    t.left(120)
    t.forward(100)
    t.left(60)