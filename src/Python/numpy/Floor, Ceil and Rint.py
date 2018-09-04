''' Date 4-9-2018 '''

import numpy as np


if __name__ == "__main__":
    array = np.array(map(float, raw_input().split()))
    np.set_printoptions(sign=' ')
    print np.floor(array)
    print np.ceil(array)
    print np.rint(array)