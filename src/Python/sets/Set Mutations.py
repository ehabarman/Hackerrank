''' Date 29-8-2018 '''

if __name__ == '__main__':
    raw_input()
    s1 = set(map(int, raw_input().split()))
    for _ in range(int(raw_input())):
        cmd, _ = raw_input().split()
        s2 = set(map(int, raw_input().split()))
        if (cmd == "intersection_update"):
            s1.intersection_update(s2)
        elif (cmd == "update"):
            s1.update(s2)
        elif (cmd == "symmetric_difference_update"):
            s1.symmetric_difference_update(s2)
        elif (cmd == "difference_update"):
            s1.difference_update(s2)

    print(sum(s1))