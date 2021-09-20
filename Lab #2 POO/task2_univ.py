class uiversity:
    def __init__(self, name, foundationYear, list_stud):
        self.name = name
        self.foundationYear = foundationYear
        self.list_stud = list_stud

    def print_data(self):
        print('name : ' + self.name)
        print(f'foundationYear :  {self.foundationYear}')
        print(f'list_stud :  {self.list_stud}')

class student:
    def __init__(self, name, age, marks):
        self.name = name
        self.age = age
        self.marks = marks

def univ_create():
    univ_list = []
    n = int(input('Nr de univ: '))
    for i in range(0, n):
        name = input('Nmae : ')
        foundationYear = int(input('foundationYear : '))

        list_stud = []
        nr_stud = int(input(f'Introdu nr de studenti din univer {name} : '))

        for j in range(0, nr_stud):
            name_stud = input('Name Student : ')
            age = int(input('Age : '))
            mark = float(input('Mark : '))
            list_stud.append(student(name_stud, age, mark))
        univ_list.append(uiversity(name, foundationYear, list_stud))

    sum_tot = 0
    for i in univ_list:
        print(f'{i.name} fondat in {i.foundationYear} : ')
        sum = 0
        count = 0
        for j in i.list_stud:
            print(f'Nume : {j.name} are {j.age} ani si nota {j.marks}')
            sum += j.marks
        med = sum / len(i.list_stud)
        sum_tot += med
        print(f'Media universitatii {i.name} este {med}')
        print('\n')
    med_tot = sum_tot / len(univ_list)
    print(f'Media totala este {med_tot}')
univ_create()