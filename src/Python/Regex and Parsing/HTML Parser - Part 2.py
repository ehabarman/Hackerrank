''' Date 5-9-2018 '''

from HTMLParser import HTMLParser
import re

class MyHTMLParser(HTMLParser):
    def handle_comment(self, data):
        if '\n' in data:
            print ('>>> Multi-line Comment')
        else:
            print ('>>> Single-line Comment')
        print (data)
    def handle_data(self, data):
        if data=='\n': return
        else:
            print (">>> Data")
            print (data)
            
if __name__ == "__main__":
    N= int(raw_input())
    html =''
    for i in range(N):
        html += raw_input().rstrip()+'\n'
    parser = MyHTMLParser()
    parser.feed(html)