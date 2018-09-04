''' Date 4-9-2018 '''

import numpy as np

if __name__ == "__main__":
    n = int(raw_input())
    nums1,nums2 = [],[]
    for _ in range(n):
        nums1.append(list(map(int, raw_input().split())))
    for _ in range(n):
        nums2.append(list(map(int, raw_input().split())))

    a = np.array(nums1)
    b = np.array(nums2)

    print np.dot(a,b)