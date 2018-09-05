''' Date 5-9-2018 '''

import re

if __name__ == "__main__":
    n = int(raw_input())
    for _ in range(n):
        x, y = raw_input().split()
        m = re.match(r'<[A-Za-z](\w|-|\.|_)+@[A-Za-z]+\.[A-Za-z]{1,3}>', y)
        if m:
            print x,y