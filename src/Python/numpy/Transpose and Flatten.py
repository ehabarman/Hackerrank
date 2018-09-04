''' Date 4-9-2018 '''

import numpy as np

if __name__ == "__main__":
    row,col = map(int,raw_input().split())
    arr = []
    for _ in range(row):
        arr.append(map(int,raw_input().split()))

    print np.array(arr).transpose()
    print np.array(arr).flatten()