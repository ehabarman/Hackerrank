''' Date 2-9-2018 '''

from collections import deque

if __name__ == "__main__":
    t = int(raw_input())
    for _ in range(t):
        raw_input()
        queue = deque(map(int,raw_input().split()))
        current_block = max(queue[0],queue[len(queue)-1])
        while len(queue)> 0:
            next_block=0
            if queue[0] >= queue[len(queue)-1]:
                next_block = queue.popleft()
            else:
                next_block = queue.pop()
            if( next_block <= current_block):
                current_block = next_block
            else :
                break

        if len(queue) == 0:
            print "Yes"
        else:
            print "No"
