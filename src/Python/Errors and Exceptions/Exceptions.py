''' Date 4-9-2018 '''

if __name__ == "__main__":
    t = int(raw_input())
    for _ in range(t):

        try:
            a,b = map(int,raw_input().split())
            print a / b
        except ValueError as e:
            print "Error Code:", e

        except ZeroDivisionError as e:
            print "Error Code: integer division or modulo by zero"