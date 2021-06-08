from tkinter import*

top = Tk()

lb1 = Label(top, text='hi', width=20, height=5, fg = "White", bg = "Black")
lb1.pack(side=LEFT)

img = PhotoImage(file = 'dog.png')
lb2 = Label(top, image=img)
lb2.pack(side=RIGHT, expand=True)

top.mainloop()