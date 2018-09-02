''' Date 2-9-2018 '''

from itertools import combinations_with_replacement

if __name__ == "__main__":
    line,length = raw_input().split()
    sorted_combinations = set([])
    for i in (list(combinations_with_replacement(line,int(length)))):
        i = sorted(i)
        sorted_combinations.add("".join(i))

    for i in sorted((sorted_combinations)):
        print i
