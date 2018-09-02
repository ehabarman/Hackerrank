''' Date 30-8-2018 '''
from itertools import combinations

if __name__ == '__main__':
    params = raw_input().split()
    combinations_list = []
    for i in range(1,int(params[1])+1):
        combinations_list.append(list(combinations(params[0], i )))

    for sub_comb in combinations_list:
        sorted_comb=[]
        for item in sub_comb:
            sorted_comb.append(sorted(item))
        print '\n'.join( [ ''.join(str(value) for value in elem)for elem in sorted(sorted_comb)])
