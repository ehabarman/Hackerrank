''' Date 4-9-2018 '''

import numpy as np

if __name__ == "__main__":

    n, m, p = map(int, raw_input().split())
    arr = np.array(raw_input().split(), int)
    for i in range(1, n + m):
        arr = np.vstack((arr, np.array(raw_input().split(), int)))
    print(arr)