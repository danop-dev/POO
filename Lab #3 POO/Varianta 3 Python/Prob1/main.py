class box1:
    def __init__(self):
        self.height = 1
        self.width = 1
        self.depth = 1

    def display(self):
        print('H : ' + str(self.height))
        print('W : ' + str(self.width))
        print('D : ' + str(self.depth))

class box2:
    def __init__(self, height):
        self.height = height
        self.width = height
        self.depth = height

    def display(self):
        print('H : ' + str(self.height))
        print('W : ' + str(self.width))
        print('D : ' + str(self.depth))

class box:
    def __init__(self, height, width, depth):
        self.height = height
        self.width = width
        self.depth = depth

    def display(self):
        print('H : ' + str(self.height))
        print('W : ' + str(self.width))
        print('D : ' + str(self.depth))

    def area(self):
        return 2*(width*height) + 2*(height*depth) + 2*(depth*width)

    def volum(self):
        return width * height * depth


height = int(input('H : '))
width = int(input('W : '))
depth = int(input('D : '))


obj1 = box1()
obj2 = box2(height)
obj3 = box(height, width, depth)

print('\n Obj 1 : ')
obj1.display()

print('\n Obj 2 : ')
obj2.display()

print('\n Obj 3 : ')
obj3.display()

print('Area : ' + str(obj3.area()))
print('Volum : ' + str(obj3.volum()))


