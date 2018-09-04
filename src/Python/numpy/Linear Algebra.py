''' Date 4-9-2018 '''

import numpy as np

if __name__ == "__main__":
    n = int(raw_input())
    nums1 = []
    for _ in range(n):
        nums1.append(list(map(float, raw_input().split())))

    print round(np.linalg.det(nums1),2)