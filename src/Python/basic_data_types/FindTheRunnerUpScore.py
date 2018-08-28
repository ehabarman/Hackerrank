''' Date 28-8-2018 '''
if __name__ == '__main__':
    n = int(raw_input())
    numbers = [ int(num) for num in raw_input().split()]
    numbers.sort()
    numbers.reverse()
    first = numbers[0]
    while True:
        if numbers[0]== first:
            del numbers[0]
        else: break
    print numbers[0]