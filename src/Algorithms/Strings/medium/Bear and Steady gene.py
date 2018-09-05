''' Date 5-9-2018 '''

from collections import Counter

n = int(raw_input())
st = raw_input()

gene_c = Counter(st)
gene_group = ['A', 'C', 'T', 'G']
for gene in gene_group:
    if gene_c[gene] > int(n / 4):
        gene_c[gene] -= int(n / 4)
    else:
        gene_c[gene] = 0

substring_count = {'A': 0, 'T': 0, 'G': 0, 'C': 0}
start = 0
end = 0
min_len = len(st)
len_st = len(st)

while end < len_st:
    if all([substring_count[gene] >= gene_c[gene] for gene in gene_group]):
        curr = end - start
        if curr < min_len:
            min_len = curr
        substring_count[st[start]] -= 1
        start += 1
    else:
        substring_count[st[end]] += 1
        end += 1

print(min_len)