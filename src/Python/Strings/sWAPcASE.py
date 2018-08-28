''' Date 28-8-2018 '''
if __name__ == '__main__':
    old_string = str(raw_input())
    new_string = ""
    for i in xrange(len(old_string)):
        if old_string[i].islower()==True:
            new_string = new_string + old_string[i].upper()
        else:
            new_string = new_string + old_string[i].lower()
    print new_string