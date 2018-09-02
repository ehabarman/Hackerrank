''' 30-8-2018 '''
import math

if __name__ == '__main__':
    AB,BC = int(raw_input()),int(raw_input())
    AC= pow(AB**2+BC**2,0.5)
    cos_ACB = (AB**2 - BC**2 - AC**2)/(-2.0*BC*AC)
    angel_ACB = math.acos(abs(cos_ACB))
    BM= pow((AC/2)**2+BC**2 - AC*BC * math.cos(angel_ACB),0.5)
    sin_MBC = (AC*math.sin(angel_ACB))/(2*BM)
    print "{0}°".format(int(round(math.asin(abs(sin_MBC))*180/math.pi,0)))
