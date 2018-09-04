''' Date 4-9-2018 '''


cube = lambda x: x**3
def fibonacci(n):
    list = []
    a,b=0,1
    for i in range (n):
        list.append(a)
        a,b = b,a+b

    return list

if __name__ == '__main__':
    n = int(raw_input())
    print map(cube, fibonacci(n))