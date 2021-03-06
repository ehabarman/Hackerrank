""" Date 5-9-2018"""

import os

def caesarCipher(s, k):
    res = ''
    for i in s:
        if i.isalpha():
            a = 'A' if i.isupper() else 'a'
            res += chr(ord(a)+ ( ord(i) - ord(a)  + k) % 26)
        else:
            res += i
    return res

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    n = int(raw_input())
    s = raw_input()
    k = int(raw_input())
    result = caesarCipher(s, k)
    fptr.write(result + '\n')
    fptr.close()
