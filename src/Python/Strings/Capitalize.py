''' Date 28-8-2018 '''

import math
import os
import random
import re
import sys

def solve(line):
    result=""+line[0].upper()
    for i in range(1,len(line)):
        if line[i]!=' ' and line[i-1]==' ' :
            result = result+line[i].upper()
        else:
            result = result + line[i]

    return result

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = raw_input()

    result = solve(s)

    fptr.write(result + '\n')

    fptr.close()