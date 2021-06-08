# 모래시계 * 3 => 정육각형
import turtle

t = turtle.Pen()
t.shape("turtle")

for i in range(3):
    t.forward(100)
    t.left(120)
    t.forward(100)
    t.left(120)
    t.forward(200)
    t.right(120)
    t.forward(100)
    t.right(120)
    t.forward(100)
    t.right(120)

