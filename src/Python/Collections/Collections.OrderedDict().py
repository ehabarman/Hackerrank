''' Date 2-9-2018 '''

from collections import OrderedDict

if __name__ == "__main__":
    ordered_dictionary = OrderedDict()
    n = int(raw_input())

    for _ in range(n):
        params = raw_input().split()
        value = params[len(params)-1]
        key = " ".join(params[:len(params)-1])

        if key in ordered_dictionary:
            ordered_dictionary[key]+=int(value)
        else:
            ordered_dictionary[key]=int(value)

    print '\n'.join( key+" "+str(ordered_dictionary[key]) for key in ordered_dictionary)