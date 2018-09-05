''' Date 5-9-2018 '''

from HTMLParser import HTMLParser

class MyHTMLParser(HTMLParser):
    def handle_starttag(self, tag, attrs):
        print(tag)
        for attr in attrs:
            print '-> {} > {}'.format(*attr)

if __name__ == "__main__":
    html = '\n'.join([raw_input() for _ in range(int(raw_input()))])
    parser = MyHTMLParser()
    parser.feed(html)
    parser.close()