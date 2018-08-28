''' Date 28-8-2018 '''
if __name__ == '__main__':
    n = int(raw_input())
    students=dict([])
    for i in xrange(n):
        params = raw_input().split()
        students[params[0]]=params[1:4]

    name = raw_input()
    result = 0
    for mark in students[name]:
        result+= float(mark)
    result/=3.0
    print "%.2f" %(round(result,2))
