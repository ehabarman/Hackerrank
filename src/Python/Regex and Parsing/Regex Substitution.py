''' Date 5-9-2018 '''

import re

if __name__ == "__main__":
    N = int(raw_input())
    for i in range(N):
        print re.sub(r'(?<= )(&&|\|\|)(?= )', lambda x: 'and' if x.group() == '&&' else 'or', raw_input())