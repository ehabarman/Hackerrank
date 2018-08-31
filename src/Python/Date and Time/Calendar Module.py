''' Date 31-8-2018 '''
import calendar

if __name__ == '__main__':
    params = map(int,raw_input().split())

    day = calendar.weekday(params[2], params[0], params[1])

    if day == 0:
        print 'MONDAY'
    elif day == 1:
        print 'TUESDAY'
    elif day == 2:
        print 'WEDNESDAY'
    elif day == 3:
        print 'THURSDAY'
    elif day == 4:
        print 'FRIDAY'
    elif day == 5:
        print 'SATURDAY'
    elif day == 6:
        print 'SUNDAY'