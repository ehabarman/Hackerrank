''' Date 30/8/2018 '''

if __name__ == '__main__':
    for i in range(1, int(input())):
        print(i * (pow(10, i) - 1) // 9)