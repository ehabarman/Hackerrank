''' Date 4-9-2018 '''

from collections import OrderedDict

if __name__ == "__main__":
    ordered_dictionary = OrderedDict()
    n = int(raw_input())

    for _ in range(n):
        word = raw_input()
        if word in ordered_dictionary:
            ordered_dictionary[word] += 1
        else:
            ordered_dictionary[word] = 1

    print len(ordered_dictionary.keys())
    for i in ordered_dictionary:
        print ordered_dictionary[i],