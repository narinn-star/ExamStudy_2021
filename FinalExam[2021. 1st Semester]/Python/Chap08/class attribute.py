class Emp:
    pass

x = Emp()
y = Emp()

Emp.dept = 'Research'
print('xDept : ', x.dept, '\tyDept : ', y.dept)             #Research / Research

x.dept = 'Accounting'
print('xDept : ', x.dept, '\tclassDept : ', Emp.dept)       #Accounting / Reasearch

Emp.dept = 'Sales'
print('xDept : ', x.dept, '\tyDept : ', y.dept)             #Accounting / Sales

print('x.__dict__ : ', x.__dict__)
print('y.__dict__ : ', y.__dict__)