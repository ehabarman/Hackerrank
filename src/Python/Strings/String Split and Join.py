''' Date 29-8-2018 '''

def split_and_join(line):
    return '-'.join(line.split())

if __name__ == '__main__':
    line = raw_input()
    result = split_and_join(line)
    print result