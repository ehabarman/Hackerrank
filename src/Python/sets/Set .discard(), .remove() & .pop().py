''' Date 29-8-2018 '''

if __name__ == '__main__':
    raw_input()
    set_a = set(map(int,raw_input().split()))
    n = int(raw_input())
    for _ in range(n):
        command = raw_input().split()
        if command[0] == "discard":
            set_a.discard(int(command[1]))
        elif command[0] == 'remove':
            set_a.remove(int(command[1]))
        elif command[0] == 'pop':
            set_a.pop()


    print sum(set_a)