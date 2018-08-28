''' Date 28-8-2018 '''
if __name__ == '__main__':
    str = raw_input()
    print any(l.isalnum()  for l in str)
    print any(l.isalpha() for l in str)
    print any(l.isdigit() for l in str)
    print any(l.islower() for l in str)
    print any(l.isupper() for l in str)