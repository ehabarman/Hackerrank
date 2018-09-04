''' Date 4-9-2018 '''

def solution(numbers):
    if all( [ i > 0 for i in numbers]):
        if any( [ str(i)==str(i)[::-1] for i in numbers] ):
            return True

    return False

if __name__ == "__main__":
    _, numbers =raw_input(), map(int,raw_input().split())
    print solution(numbers)