class monitor:
    def __init__(self, color, dimension, resolution):
        self.color = color
        self.dimension = dimension
        self.resolution = resolution

    def print_data(self):
        print('Color : ' + self.color)
        print(f'Rezolution :  {self.resolution}')
        print(f'Dimension :  {self.dimension}')

    def color(self):
        return str(self.color)

    def rez(self):
        return self.resolution

    def dimems(self):
        return self.dimension

monitor1 = monitor('RGB', 24, 1920*1080)
monitor2 = monitor('sRGB', 26, 2048*1080)

if monitor1.rez() > monitor2.rez():
    print(f'Monitorul 1 are o rezolutie mai mare : {monitor1.rez()}px')
elif monitor1.rez() < monitor2.rez():
    print(f'Monitorul 2 are o rezolutie mai mare : {monitor2.rez()}px')
else:
    print(f'Ambele au aceiasi rezolutie {monitor1.rez()}pix')