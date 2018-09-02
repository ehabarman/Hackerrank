''' Date 2-9-2018 '''
from itertools import product
if __name__ == "__main__":
    K,M = map(int,raw_input().split())
    n = []
    for i in range(K):
        n.append( (map(int,raw_input().split()))[1:])

    max_sum=0
    prducts_list=product(*n)
    for i in prducts_list:
        sum=0
        for num in i:
            sum+= (num**2)%M
        sum%=M
        max_sum=max(sum,max_sum)
    print max_sum