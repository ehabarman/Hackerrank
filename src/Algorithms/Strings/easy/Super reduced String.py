''' Date 2-9-2018 '''

if __name__ == "__main__":
    s = raw_input().strip()

    m = list(s)
    c = 0
    while c < len(m) - 1:
        if m[c] == m[c + 1]:
            del m[c]
            del m[c]
            if c != 0:
                c = c - 1
        else:
            c = c + 1
    if len(m) == 0:
        result= 'Empty String'
    else:
        result= ''.join(map(str, m))

    print(result)