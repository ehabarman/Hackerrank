''' Date 5-9-2018 '''
import re

if __name__ == "__main__":
    for i in range(int(input())):
        matches = re.findall(r':?.(#[0-9a-fA-F]{6}|#[0-9a-fA-F]{3})', raw_input())
        if matches:
            print "\n".join([ str(match) for match in matches])
