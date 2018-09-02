''' Date 2-9-2018 '''

from collections import namedtuple

if __name__ == "__main__":

    n = int(raw_input())
    a = raw_input()
    total = 0
    Student = namedtuple('Student', a)
    for _ in range(n):
        student = Student(*raw_input().split())
        total += int(student.MARKS)
    print('{}'.format(float(total) / n))