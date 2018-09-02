''' Date 29-8-2018 '''

if __name__ == '__main__':
    n = int(raw_input())
    countries = [ raw_input() for i in range(n)]
    print len(set(countries))