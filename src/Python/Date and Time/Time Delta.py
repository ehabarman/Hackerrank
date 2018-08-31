''' Date 31-8-2018 '''

from datetime import datetime as dt
from datetime import timedelta

n = int(raw_input())
for x in range(n):
    d1 = raw_input()
    d2 = raw_input()
    timezone1 = d1[25:30]
    timezone2 = d2[25:30]
    date_format = '%a %d %b %Y %X'
    date1 = dt.strptime(d1[0:24], date_format)
    date2 = dt.strptime(d2[0:24], date_format)
    if timezone1[0] == "+":
        date1 -= timedelta(hours=int(timezone1[1:3]), minutes=int(timezone1[3:]))
    elif timezone1[0] == "-":
        date1 += timedelta(hours=int(timezone1[1:3]), minutes=int(timezone1[3:]))
    if timezone2[0] == "+":
        date2 -= timedelta(hours=int(timezone2[1:3]), minutes=int(timezone2[3:]))
    elif timezone2[0] == "-":
        date2 += timedelta(hours=int(timezone2[1:3]), minutes=int(timezone2[3:]))
    print int(abs((date1 - date2).total_seconds()))
