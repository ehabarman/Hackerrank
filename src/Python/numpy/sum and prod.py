''' Date 4-9-2018 '''

import numpy as np


if __name__ == "__main__":
    rows,cols= map(int,raw_input().split())
    list = []
    for _ in range(rows):
        list.append(map(int,raw_input().split()))
    arr = np.array(list)

    print np.prod(np.sum(arr,axis=0) , axis=None)