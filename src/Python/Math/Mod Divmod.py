''' Date 29-8-2018 '''

if __name__ == '__main__':
    a,b= int(raw_input()),int(raw_input())
    result = divmod(a,b)
    print '{0}\n{1}\n{2}'.format(result[0],result[1],result)