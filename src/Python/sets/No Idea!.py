''' Date 29-8-2018 '''

if __name__ == '__main__':
    _,_ = raw_input().split()
    arr = map(int,raw_input().split())
    set_a = set(map(int,raw_input().split()))
    set_b = set(map(int,raw_input().split()))
    happiness_counter =0
    for elem in arr:
        sub = set([elem])
        if sub.intersection(set_a)==sub:
            happiness_counter+=1
            check1=False

        if sub.intersection(set_b)==sub:
            happiness_counter-=1
            check2=False


    print happiness_counter


