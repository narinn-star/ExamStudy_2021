class Emp:
    def restart(self):
        self.bonus = 0

    def sale(self):
        self.bonus += 10

a = Emp()
a.name = 'James'

a.restart()
a.sale()
print(a.name + '의 보너스는', a.bonus)