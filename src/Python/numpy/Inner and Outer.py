''' Date 4-9-2018 '''

import numpy as np

if __name__ == "__main__":
    A = map(int,raw_input().split())
    B = map(int, raw_input().split())

    print np.inner(A, B)
    print np.outer(A, B)