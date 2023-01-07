# Operations on Lists
L = [1, 2, 3]
L1 = [4, 5, 6]
L.extend([4, 5, 6])

print(L)
L1 += L
print(L1)

L2 = L1
L1.remove(6)
print(L1)
print(L2)

