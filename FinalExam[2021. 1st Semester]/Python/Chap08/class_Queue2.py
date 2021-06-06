class Queue2(list):
    def isEmpty(self):
        return (len(self)==0)

    def dequeue(self):
        return self.pop(0)

    def enqueue(self, item):
        return self.append(item)

fruit = Queue2()

fruit.enqueue('apple')
fruit.enqueue('banana')
fruit.enqueue('coconut')

# print(fruit.dequeue())
# print(fruit.dequeue())
# print(fruit.isEmpty())
# print(fruit.dequeue())
# print(fruit.isEmpty())

print(eval(repr(fruit)))
print(len(fruit))