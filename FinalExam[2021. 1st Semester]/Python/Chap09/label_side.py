from tkinter import*

top = Tk()

lab1= Label(top, text='위쪽', relief=RAISED, padx=15)
lab1.grid(row=0, column=0, columnspan=2)
lab2= Label(top, text='왼쪽', relief=RAISED, padx=15)
lab2.grid(row=1, column=0)
lab3 = Label(top, text='오른쪽', relief=RAISED, padx=15)
lab3.grid(row=1, column=1)
lab4 = Label(top, text='아래쪽', relief=RAISED, padx=15)
lab4.grid(row=2, column=0, columnspan=2)

top.mainloop()
    