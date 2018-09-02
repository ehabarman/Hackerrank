''' Date 30-8-2018 '''
from itertools import product

if __name__ == '__main__':
    a = map(int,raw_input().split())
    b = map(int,raw_input().split())
    print ' '.join([ str(i) for i in list(product(a, b))])