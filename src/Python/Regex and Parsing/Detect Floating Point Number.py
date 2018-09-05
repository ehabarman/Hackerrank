''' Date 5-9-2018 '''

import re

if __name__ == "__main__":
    for _ in range(int(raw_input())):
        print bool(re.match(r'^[-+]?[0-9]*\.[0-9]+$', raw_input()))