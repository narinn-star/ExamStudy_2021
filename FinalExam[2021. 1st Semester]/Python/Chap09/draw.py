from tkinter import*

top = Tk()

oldx, oldy = 0, 0

def begin(event):
    global oldx, oldy,curve
    oldx, oldy = event.x, event.y
    curve = []

def draw(event):
    global oldx, oldy, cv,curve
    newx, newy = event.x, event.y
    curve.append(cv.create_line(oldx, oldy, newx, newy))
    oldx, oldy = newx, newy

def delete(event):
    global curve
    for segment in curve:
        cv.delete(segment)

cv = Canvas(top, width = 100, height=100)
cv.bind('<Button-1>', begin)
cv.bind('<Button1-Motion>', draw)
cv.bind('<Control-Button-1>', delete)
cv.pack()

top.mainloop()