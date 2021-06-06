class Super:
    def method(self):
        print('in Super.method')

class Inheritor(Super):
    pass

class Replacer(Super):
    def method(self):
        print('in Replacer.method')

class Extender(Super):
    def method(self):
        print('starting Extender.method') 
        Super.method(self)          #Super 메소드 호출
        print('ending Extender.method')       


extend = Extender()
extend.method()
print("========================")
super = Super()
super.method()