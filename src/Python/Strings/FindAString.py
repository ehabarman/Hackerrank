''' Date 28-8-2018 '''
def count_substring(original,sub):
    counter = 0
    limit = len(original)-len(sub)+1
    for i in range(0,limit):
        if sub == original[i:i+len(sub)]:
            counter+=1
    return counter

if __name__ == '__main__':
    string = raw_input().strip()
    sub_string = raw_input().strip()

    count = count_substring(string, sub_string)
    print count