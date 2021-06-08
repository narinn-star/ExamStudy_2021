from tkinter import*
from time import strptime, strftime
from tkinter.messagebox import showinfo

top = Tk()

def compute(event):
    global dateEnt
    date = dateEnt.get()

    weekday = strftime('%A', strptime(date, '%b %d, %Y'))
    showinfo(message= '{} was a {}'.format(date, weekday))

    dateEnt.delete(0,END)

label = Label(top, text='enter date')
label.grid(row=0, column=0)
dateEnt = Entry(top)
dateEnt.bind('<Return>', compute)
dateEnt.grid(row=0, column=1)
button = Button(top, text='enter date', command=compute)
button.grid(row=1, column=0, columnspan=2)


top.mainloop()