from tkinter import*
from time import strftime, localtime, gmtime

top = Tk()

def local():
    time = strftime('Day : %d %b %Y\nTime: %T %p', localtime())
    print(time)

def green():
    time = strftime('Day : %d %b %Y\nTime: %T %p', gmtime())
    print(time)

bt1 = Button(top, text='local', command=local)
bt1.pack()
bt2 = Button(top, text='green', command=green)
bt2.pack()


top.mainloop()