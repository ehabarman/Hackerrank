""" Date 4-9-2018 """

from string import ascii_lowercase, ascii_uppercase

if __name__ == "__main__":
    sortkey = ascii_lowercase + ascii_uppercase + "1357902468"
    print reduce(lambda x,y: x+y, sorted(raw_input(),key=sortkey.index))