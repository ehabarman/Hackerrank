''' Date 5-9-2018 '''

import re

if __name__ == "__main__":
    v = "aeiou"
    c = "qwrtypsdfghjklzxcvbnm"
    m = re.findall(r"(?<=[%s])([%s]{2,})[%s]" % (c, v, c), raw_input(), flags = re.I)
    print('\n'.join(m or ['-1']))