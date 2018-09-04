''' Date 4-9-2018 '''

import numpy as np


if __name__ == "__main__":
    rows, cols = map(int, raw_input().split())
    nums = []
    for _ in range(rows):
        nums.append(list(map(int, raw_input().split())))
    np.set_printoptions(sign=' ')
    nums = np.array(nums)
    print(np.mean(nums, axis=1))
    print(np.var(nums, axis=0))
    print(np.round(np.std(nums), 12))