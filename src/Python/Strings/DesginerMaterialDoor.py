''' Date 29-8-2018 '''
if __name__ == '__main__':
    n, m = map(int, raw_input().split())
    pattern = [('.|.' * (2 * i + 1)).center(m, '-') for i in range(n // 2)]
    print('\n'.join(pattern + ['WELCOME'.center(m, '-')] + pattern[::-1]))