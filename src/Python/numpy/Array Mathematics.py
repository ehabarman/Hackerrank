''' Date 4-9-2018 '''

import numpy as np

if __name__ == "__main__":
    rows, cols = map(int, raw_input().split())
    nums1,nums2 = [],[]
    for _ in range(rows):
        nums1.append(list(map(int, raw_input().split())))
    for _ in range(rows):
        nums2.append(list(map(int, raw_input().split())))

    a = np.array(nums1)
    b = np.array(nums2)
    print a+b
    print a-b
    print a*b
    print a/b
    print a%b
    print a**b
    


