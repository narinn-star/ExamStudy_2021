def intro(emp):
    print('My name is', emp.name, '!')

class Emp:
    myIntro = intro

a = Emp()
a.name = 'John'
Emp.myIntro(a)


class Emp2:
    def myIntro(self):
        print('My name is', self.name, '!')

b = Emp2()
b.name = 'Daniel'
b.myIntro()