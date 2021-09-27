class Queue:
    def __init__(self):
        self.elements = []
        self.count = 0

    def push(self, data):
        self.elements.append(data)
        self.count += 1
        return data

    def push_to_max(self, data, max_queue):
        if max_queue == self.count:
            print(' - ' + str(data) + ' nu poate fi adaugata')
        else:
            self.elements.append(data)
            print(' + ' + str(data) + ' este adaugat')
            self.count += 1
        return data

    def dequeue(self):
        self.count -= 1
        return self.elements.pop(0)

    def rear(self):
        return self.elements[-1]

    def front(self):
        return self.elements[0]

    def isEmpty(self):
        return len(self.elements) == 0

    def isFull(self, max):
        return len(self.elements) == max

    def display(self):
        print(self.elements)

if __name__ == '__main__':
    queue = Queue()

    print('Queue este goala : ' + str(queue.isEmpty()) + '\n')

    queue.push(10)
    queue.push(20)
    queue.push(30)
    queue.push(40)
    queue.push(50)

    queue.display()
    print('Queue este goala : ' + str(queue.isEmpty()) + '\n')

    #remuve first element
    queue.dequeue()
    queue.display()

    print('First : '  + str(queue.front()))
    print('Last : ' + str(queue.rear()))



    print('\nQueue 2 :')
    queue2 = Queue()
    print('Queue este goala : ' + str(queue2.isEmpty()) + '\n')

    max = 2
    queue2.push_to_max(10, max)
    queue2.push_to_max(20, max)
    print('Este plin : ' + str(queue2.isFull(max)))
    queue2.push_to_max(30, max)
    queue2.push_to_max(40, max)

    queue2.display()
    print('Queue este goala : ' + str(queue2.isEmpty()) + '\n')

    # remuve first element
    queue2.dequeue()
    queue2.display()

    print('First : ' + str(queue2.front()))
    print('Last : ' + str(queue2.rear()))
