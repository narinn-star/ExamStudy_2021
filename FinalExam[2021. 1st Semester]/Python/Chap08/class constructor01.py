class Emp:
    empTotal = 0

    def __init__(self, name, bonus = 100):
        self.name = name
        self.bonus = self.base = bonus
        Emp.empTotal += 1

    def restart(self):
        self.bonus = self.base
    
    def sale(self):
        self.bonus += 10

a = Emp('Peter', 50)
b = Emp('Austin')

a.sale()
print(a.name + '의 보너스: ', a.bonus)
print(b.name + '의 보너스: ', b.bonus)
print('총 직원 수 : ', Emp.empTotal)
