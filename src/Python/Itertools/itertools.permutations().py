''' Date 30-8-2018 '''
from itertools import permutations

if __name__ == '__main__':
    params = raw_input().split()
    print '\n'.join([ ''.join( [ str(item) for item in elem] ) for elem in sorted(list(permutations(params[0], int(params[1]))))])
