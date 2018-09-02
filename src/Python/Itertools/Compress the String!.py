''' Date 2-9-2018 '''
from itertools import groupby

if __name__ == "__main__":
   input = raw_input()
   repetition = []

   for k, g in groupby(input):
       current_tuple = tuple([len(list(g)),int(k)])
       repetition.append(current_tuple)

   print " ".join(str(elem) for elem in repetition)
