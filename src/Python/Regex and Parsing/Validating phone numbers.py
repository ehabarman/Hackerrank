''' Date 5-9-2018 '''

import re

if __name__ == "__main__":
    N=int(raw_input())
    for i in range(N):
        if re.match(r'[789]\d{9}$',raw_input()):
            print 'YES'
        else:
            print 'NO'