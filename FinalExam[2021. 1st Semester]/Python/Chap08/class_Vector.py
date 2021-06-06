from class_Point import Point

class Vector(Point):
    
    def __add__(self, other):
        return (self.x + other.x, self.y + other.y)

    def __mul__(self, other):
        return (self.x * other.x + self.y * other.y)

    def __repr__(self):
        return 'Vector{}'.format(self.get())

v1 = Vector(1, 3)
v2 = Vector(-2, 4)
print(v1+v2)
print(v1 * v2)
print(eval(repr(v1)))
print(eval(repr(v2)))