''' Date 4-9-2018 '''

import math

class Complex(object):

    def __init__(self, real,img):
        self.real = float(real)
        self.img = float(img)

    def __add__(self, other):
        return Complex(self.real+other.real, self.img+other.img)

    def __sub__(self, other):
        return Complex(self.real-other.real, self.img-other.img)

    def __mul__(self, other):
        return Complex(self.real*other.real-self.img*other.img,
                         self.real*other.img+self.img*other.real)

    def __div__(self, other):
        real_numerator = self.real * other.real + self.img * other.img
        imag_numerator = self.img * other.real - self.real * other.img
        denom = other.real**2 + other.img ** 2
        return Complex(real_numerator / denom, imag_numerator / denom)

    def __str__(self):
        if (self.img < 0):
            return "{0:.2f}-{1:.2f}i".format(self.real,abs(self.img))
        else:
            return "{0:.2f}+{1:.2f}i".format(self.real, abs(self.img))

    def mod(self):
        return Complex(pow(self.real**2 + self.img**2,0.5),0)

if __name__ == '__main__':
    c = map(float, raw_input().split())
    d = map(float, raw_input().split())
    x = Complex(*c)
    y = Complex(*d)
    print '\n'.join(map(str, [x+y, x-y, x*y, x/y, x.mod(), y.mod()]))