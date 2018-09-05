''' Date 5-9-2018 '''

import re

if __name__ == "__main__":
    regex_pattern = r'[.,]+'
    print("\n".join(re.split(regex_pattern, raw_input())))