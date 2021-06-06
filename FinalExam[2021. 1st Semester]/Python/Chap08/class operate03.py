class Queue:
    def __init__(self, q=None):
        if q == None:
            self.q = []
        else:
            self.q = q

    def isEmpty(self):
        if (len(self.q) == 0):
            return True
        return False
    
    def enqueue(self, item):
        return self.q.append(item)

    def dequeue(self):
        return self.q.pop(0)

    def __eq__(self, other):
        return self.q == other.q

    def __len__(self):
        return len(self.q)
    
    def __repr__(self):
        return 'Queue({})'.format(self.q)

fruit = Queue()
fruit.enqueue('apple')
fruit.enqueue('banana')
fruit.enqueue('coconut')
print(fruit)

print(len(fruit))
print(fruit == fruit)
print(fruit == eval(repr(fruit)))