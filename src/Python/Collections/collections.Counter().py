''' Date 30-8-2018 '''

from collections import Counter

if __name__  == '__main__':
    _,goods = raw_input(),Counter(map(int,raw_input().split()))
    n,sum = int(raw_input()),0
    for i in range(n):
       params = map(int,raw_input().split())
       if goods[params[0]] > 0:
           sum+= params[1]
           goods[params[0]]-=1
    print sum
