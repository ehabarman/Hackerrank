''' Date 4-9-2018 '''


if __name__ == "__main__":

    students,subjects = map(int,raw_input().split())
    student_marks = [ 0 for _ in range(students)]

    for _ in range(subjects):
        marks = map(float,raw_input().split())
        for i in range(students):
            student_marks[i]+=marks[i]
    print "\n".join( [ str(student_marks[i]/subjects) for i in range(students)])

