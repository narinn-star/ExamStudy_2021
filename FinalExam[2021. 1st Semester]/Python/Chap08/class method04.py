class Point:
    def setx(self, xcoord):
        self.x = xcoord

    def sety(self, ycoord):
        self.y = ycoord

    def get(self):
        return(self.x, self.y)

    def move(self, dx, dy):
        self.x += dx
        self.y += dy
    
    def getx(self):
        return self.x

a = Point()
a.setx(3)
a.sety(4)
print(a.get())
print(a.getx())