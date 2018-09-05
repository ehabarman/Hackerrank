''' Date 5-9-2018 '''

import re

if __name__ == "__main__":
    n, m = map(int, raw_input().split())
    a, b = [], ""
    for _ in range(n):
        a.append(raw_input())

    for z in zip(*a):
        b += "".join(z)

    print(re.sub(r"(?<=\w)([^\w]+)(?=\w)", " ", b))