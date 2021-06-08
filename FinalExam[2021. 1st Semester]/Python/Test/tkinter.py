from tkinter import*

top = Tk()

lb1 = Label(top, text='N1')
lb1.grid(row=0, column=0)
lb2 = Label(top, text='N2')
lb2.grid(row=0, column=2)
lb3 = Label(top, text='결과')
lb3.grid(row=2, column=2)


bt1 = Label(top, text=' + ')
bt1.grid(row=0, column=1)

en1 = Entry(top)
en1.grid(row = 1, column=0, columnspan=3)

top.mainloop()

# ?. 결과 그리기