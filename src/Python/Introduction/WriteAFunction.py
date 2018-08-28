''' Date 28-8-2018 '''
def is_leap(x):
    if ( x % 4 != 0 or x % 100 == 0 and x % 400 != 0):
        return False
    else:
        return True

if __name__ == '__main__':
    year = int(raw_input())
    print is_leap(year)