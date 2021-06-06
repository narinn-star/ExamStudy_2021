class Point:
    def __init__(self, xcoord=0, ycoord=0):
        self.x = xcoord
        self.y = ycoord

    def setx(self, xcoord):
        self.x = xcoord

    def sety(self, ycoord):
        self.y = ycoord

    def get(self):
        return (self.x, self.y)

    def move(self, dx, dy):
        self.x += dx
        self.y += dy

    def __eq__(self, other):
        return self.x == other.x and self.y == other.y

    def __repr__(self):
        return 'Point({}, {})'.format(self.x, self.y)
