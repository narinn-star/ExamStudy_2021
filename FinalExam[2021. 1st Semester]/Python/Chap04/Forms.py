from tkinter import*

top = Tk()
top.title('tel')
cnt = 1
def Del():
    n.delete(0,END) 
    t.delete(0, END)

def Add():
    mem = n.get() +' '+ t.get() + '\n'
    infile = open('phonebook.txt', 'a')
    infile.write(mem)
    infile.close()
    Del()

def Read():
    Del()
    infile = open('phonebook.txt', 'r')
    content = infile.readlines()
    List = content[0].rstrip()
    infile.close()
    resname, restel = List.split()
    n.insert(0, resname)
    t.insert(0, restel)

def Next():
    global cnt
    Del()
    infile = open('phonebook.txt', 'r')
    content = infile.readlines()
    List = content[cnt].rstrip()
    infile.close()
    resname, restel = List.split()
    n.insert(0, resname)
    t.insert(0, restel)
    cnt += 1

name = Label(top, text='이름 ')
name.grid(row=0, column=0)
tel = Label(top, text='전화번호  ')
tel.grid(row=1, column=0)

n = Entry(top)
n.grid(row=0, column=1, columnspan=3)
t = Entry(top)
t.grid(row=1, column=1, columnspan=3)

add = Button(top, text='추가', command=Add)
add.grid(row=3, column=1)
read = Button(top, text='파일 읽기', command=Read)
read.grid(row=3, column=2)
next = Button(top, text='다음', command=Next)
next.grid(row=3, column=3)

top.mainloop()