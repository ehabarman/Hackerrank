""" Date 5-9-2018 """

import os
from collections import Counter

def gameOfThrones(s):
    num_odd = 0
    s1 = Counter(s)
    for each in s1.values():
        if each % 2 != 0:
            num_odd += 1
            if num_odd > 1:
                return 'NO'
    return ('YES')

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    s = raw_input()
    result = gameOfThrones(s)
    fptr.write(result + '\n')
    fptr.close()
