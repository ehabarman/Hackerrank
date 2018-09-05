""" Date 5-9-2018"""

if __name__ == "__main__":
    for _ in range(int(raw_input())):
        if set(raw_input()) & set(raw_input()):
            print 'YES'
        else:
            print "NO"