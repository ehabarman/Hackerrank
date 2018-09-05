''' Date 5-9-2018 '''

from HTMLParser import HTMLParser

class MyHTMLParser(HTMLParser):
    def handle_starttag(self, tag, attrs):
        print 'Start :', tag
        for ele in attrs:
            print '->', ele[0], '>', ele[1]

    def handle_endtag(self, tag):
        print 'End   :', tag

    def handle_startendtag(self, tag, attrs):
        print 'Empty :', tag
        for ele in attrs:
            print '->', ele[0], '>', ele[1]

if __name__ == "__main__":
    MyParser = MyHTMLParser()
    MyParser.feed(''.join([raw_input().strip() for _ in range(int(raw_input()))]))