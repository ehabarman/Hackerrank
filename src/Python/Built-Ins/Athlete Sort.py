''' Date 4-9-2018 '''

if __name__ == "__main__":
    rows,cols = map(int,raw_input().split())
    unsorted_list = []

    for _ in range(rows):
        unsorted_list.append(map(int,raw_input().split()))

    k = int(raw_input())
    unsorted_list.sort(key=lambda x: x[k])

    for line in unsorted_list:
        print " ".join( str(i) for i in line)

