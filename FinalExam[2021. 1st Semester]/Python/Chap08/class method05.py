class Test:
    version = 1.02

a = Test()
b = Test()

# =========================

print(a.version)        #1.02
print(b.version)        #1.02
print(Test.version)     #1.02
Test.version = 1.03     
print(a.version)        #1.03
print(Test.version)     #1.03
a.version = 'Latest!!'  
print(Test.version)     #1.03
print(b.version)        #1.03
print(a.version)        #Latest!!