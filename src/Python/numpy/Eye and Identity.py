''' Date 4-9-2018 '''

import numpy as np


if __name__ == "__main__":
    rows, cols = map(int, raw_input().split())
    np.set_printoptions(sign=' ')
    if rows == cols:
        print np.identity(rows)
    else:
        print np.eye(rows,cols)