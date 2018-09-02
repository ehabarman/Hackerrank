''' Date 29-8-2018 '''
from __future__ import division

def average(array):
    heights = set(array)
    return float(sum(heights))/len(heights)


if __name__ == '__main__':
    n = int(raw_input())
    arr = map(int, raw_input().split())
    result = average(arr)
    print result