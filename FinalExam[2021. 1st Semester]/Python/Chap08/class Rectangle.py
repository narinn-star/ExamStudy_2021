class Rectangle:
    def __init__(self, width, length):
        self.width = width
        self.length = length

    def setSize(self, width, length):
        self.width = width
        self.length = length
    
    def perimeter(self):
        return self.width*2 + self.length*2
    
    def area(self):
        return self.width * self.length
   
rectangle = Rectangle(3, 4)
print(rectangle.perimeter())
print(rectangle.area())