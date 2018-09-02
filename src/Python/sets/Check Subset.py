''' Date 29-8-2018 '''

if __name__ == '__main__':

    for _ in range(int(raw_input())):
        n = raw_input()
        set_a = set(map(int, raw_input().split()))
        m = raw_input()
        set_b = set(map(int, raw_input().split()))
        print set_a.intersection(set_b)== set_a