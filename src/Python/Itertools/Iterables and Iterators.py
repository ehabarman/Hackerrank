''' Date 2-9-2018 '''
import operator as op

def ncr(n, r):
    r = min(r, n-r)
    numer = reduce(op.mul, xrange(n, n-r, -1), 1)
    denom = reduce(op.mul, xrange(1, r+1), 1)
    return numer//denom

if __name__ == "__main__":
    n = int(raw_input())
    letters = raw_input().split()
    k = int(raw_input())
    a_occurrences = 0
    for i in letters:
        if i == "a":
            a_occurrences+=1

    numerator =0
    for i in range (1,min(a_occurrences+1,k+1)):
        numerator += ncr(a_occurrences,i)*ncr(n-a_occurrences,k-i)
    denominator = ncr(n,k)
    result = float(numerator)/denominator
    print min(result,1)

