''' Date 5-9-2018 '''

def score_words(words):
    score = 0
    for word in words:
        num_vowels = sum(map(word.count, "aeiouy"))
        score += 2 if num_vowels % 2 == 0 else 1
    return score

n = int(raw_input())
words = raw_input().split()
print score_words(words)