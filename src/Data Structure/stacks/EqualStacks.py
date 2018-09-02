''' Date 2-9-2018 '''

from collections import deque

if __name__ == "__main__":
    n = len(raw_input().split())
    stacks = [ deque(map(int, raw_input().strip().split())) for i in range(n)]
    heights = list(map(sum, stacks))

    while len(set(heights)) > 1:
        current_highest = heights.index(max(heights))
        heights[current_highest] -= stacks[current_highest].popleft()

    print(heights[0])