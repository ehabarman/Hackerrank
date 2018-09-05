""" Date 5-9-2018"""

import os


def makingAnagrams(s1, s2):
    s3=list(s2)
    for i in s1:
        if i in s3:
            s3.remove(i)
    no_common=len(s2)-len(s3)
    return len(s1)+len(s2)-2*no_common

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    s1 = raw_input()
    s2 = raw_input()
    result = makingAnagrams(s1, s2)
    fptr.write(str(result) + '\n')
    fptr.close()
