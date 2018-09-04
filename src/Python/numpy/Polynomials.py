''' Date 4-9-2018 '''

import numpy as np

if __name__ == "__main__":
    coffs = map(float,raw_input().split())[::-1]
    x = float(raw_input())
    sum=0;

    for i in range(len(coffs)):
        sum+= (x**i) * coffs[i]

    print sum

