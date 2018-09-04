''' Date 4-9-2018 '''

import numpy as np

if __name__ == "__main__":
    list = map(int,raw_input().split())
    print np.array(list).reshape(3,3)