''' Date 28-8-2018 '''
if __name__ == '__main__':
    n = int(raw_input())
    numbers = raw_input().split(' ')
    t = tuple([int(numbers[i]) for i in range(n)])
    print hash(t)