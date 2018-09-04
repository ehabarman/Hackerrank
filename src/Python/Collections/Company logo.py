''' Date 4-9-2018 '''

from collections import Counter

if __name__ == "__main__":
    print '\n'.join([x[0]+' '+str(x[1]) for x in sorted(Counter(list(raw_input().strip())).items(),key=lambda x: (-x[1],x[0]))[:3]])