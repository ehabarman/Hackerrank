''' Date 29-8-2018 '''

def check_if_superset(superset,n):
    for i in range(n):
        subset = set(raw_input().split())
        if len(subset) == len(superset):
            return False
        elif subset.intersection(superset) != subset:
            return False

    return True


if __name__ == '__main__':
    superset = set(raw_input().split())
    n = int(raw_input())

    print check_if_superset(superset,n)