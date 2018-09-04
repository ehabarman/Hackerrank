''' Date 4-9-2018 '''

import numpy as np

if __name__ == "__main__":
    shape =tuple(map(int,raw_input().split()))
    print np.zeros(shape,np.int)
    print np.ones(shape,np.int)