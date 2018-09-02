''' Date 29-8-2018 '''

if __name__ == '__main__':
    k,arr = int(raw_input()),list(map(int, raw_input().split()))
    myset = set(arr)
    print(((sum(myset)*k)-(sum(arr)))//(k-1))