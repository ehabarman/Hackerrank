''' Date 5-9-2018 '''

import re

if __name__ == "__main__":
    TESTER = re.compile(
        r"^"
        r"(?!.*(\d)(-?\1){3})"
        r"[456]"
        r"\d{3}"
        r"(?:-?\d{4}){3}"
        r"$")
    for _ in range(int(raw_input())):
        if TESTER.search(raw_input()):
            print "Valid"
        else:
            print "Invalid"
