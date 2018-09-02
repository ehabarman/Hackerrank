''' Date 30-8-2018 '''

if __name__  == '__main__':
    n,m = map(int,raw_input().split())
    group_a= dict([])

    for i in range(n):
        key = raw_input()
        if key not in group_a:
            group_a[key] = []
        group_a[key].append(i+1)

    for i in range(m):
        key = raw_input()
        if key in group_a:
            print ' '.join( [ str(j) for j in group_a[key]])
        else:
            print '-1'

