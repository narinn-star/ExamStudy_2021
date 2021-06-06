class Queue:
    def __init__(self):
        self.q = []

    def isEmpty(self):
        if (len(self.q) == 0):
            return True
        return False
    
    def enqueue(self, item):
        return self.q.append(item)

    def dequeue(self):
        return self.q.pop(0)

fruit = Queue()

fruit.enqueue('apple')
fruit.enqueue('banana')
fruit.enqueue('coconut')

print(fruit.dequeue())
print(fruit.dequeue())
print(fruit.isEmpty())
print(fruit.dequeue())
print(fruit.isEmpty())