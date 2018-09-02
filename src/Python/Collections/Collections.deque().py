''' Date 2-9-2018 '''

from collections import deque

if __name__ == "__main__":
    queue = deque([])
    n = int(raw_input())

    for i in range(n):
        params = raw_input().split()

        if params[0] == "append":
            queue.append(int(params[1]))
        elif params[0] == "appendleft":
            queue.appendleft(int(params[1]))
        elif params[0] == "popleft":
            queue.popleft()
        elif params[0] == "pop":
            queue.pop()

    print " ".join( str(elem) for elem in queue)
