import turtle
import random

t = turtle.Turtle()

for k in range(10):
    degree = random.randint(1, 360)
    length = random.randint(10,100)
    t.left(degree)
    t.forward(length)