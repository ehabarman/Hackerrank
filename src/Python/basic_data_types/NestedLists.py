''' Date 28-8-2018 '''
from operator import itemgetter
if __name__ == '__main__':

    marks = [[raw_input(), float(raw_input())] for _ in range(int(raw_input()))]
    marks.sort(key=itemgetter(1))

    lowest_mark = marks[0][1]
    while marks!=[]:
        if lowest_mark == marks[0][1]:
            del marks[0]
        else:
            break
    second_lowest = marks[0][1]
    names_list = []

    while marks!=[]:
        if second_lowest == marks[0][1]:
            names_list.append(marks[0][0])
            del marks[0]
        else:
            break

    for name in sorted(names_list):
        print name
