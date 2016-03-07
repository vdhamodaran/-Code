"""
Insertion Sort Complexity O(n^2)
"""
list = [9,8,7,6,5,4,3,2,1]
def insertionSort(s):
    for i in range(len(s)):
        j=i;
        while j>0 and s[j] < s[j-1]:
            print s
            s[j],s[j-1] = s[j-1],s[j]
            j= j-1
    return s

print insertionSort(list)

"""
Operation:
[9, 8, 7, 6, 5, 4, 3, 2, 1]
[8, 9, 7, 6, 5, 4, 3, 2, 1]
[8, 7, 9, 6, 5, 4, 3, 2, 1]
[7, 8, 9, 6, 5, 4, 3, 2, 1]
[7, 8, 6, 9, 5, 4, 3, 2, 1]
[7, 6, 8, 9, 5, 4, 3, 2, 1]
[6, 7, 8, 9, 5, 4, 3, 2, 1]
[6, 7, 8, 5, 9, 4, 3, 2, 1]
[6, 7, 5, 8, 9, 4, 3, 2, 1]
[6, 5, 7, 8, 9, 4, 3, 2, 1]
[5, 6, 7, 8, 9, 4, 3, 2, 1]
[5, 6, 7, 8, 4, 9, 3, 2, 1]
[5, 6, 7, 4, 8, 9, 3, 2, 1]
[5, 6, 4, 7, 8, 9, 3, 2, 1]
[5, 4, 6, 7, 8, 9, 3, 2, 1]
[4, 5, 6, 7, 8, 9, 3, 2, 1]
[4, 5, 6, 7, 8, 3, 9, 2, 1]
[4, 5, 6, 7, 3, 8, 9, 2, 1]
[4, 5, 6, 3, 7, 8, 9, 2, 1]
[4, 5, 3, 6, 7, 8, 9, 2, 1]
[4, 3, 5, 6, 7, 8, 9, 2, 1]
[3, 4, 5, 6, 7, 8, 9, 2, 1]
[3, 4, 5, 6, 7, 8, 2, 9, 1]
[3, 4, 5, 6, 7, 2, 8, 9, 1]
[3, 4, 5, 6, 2, 7, 8, 9, 1]
[3, 4, 5, 2, 6, 7, 8, 9, 1]
[3, 4, 2, 5, 6, 7, 8, 9, 1]
[3, 2, 4, 5, 6, 7, 8, 9, 1]
[2, 3, 4, 5, 6, 7, 8, 9, 1]
[2, 3, 4, 5, 6, 7, 8, 1, 9]
[2, 3, 4, 5, 6, 7, 1, 8, 9]
[2, 3, 4, 5, 6, 1, 7, 8, 9]
[2, 3, 4, 5, 1, 6, 7, 8, 9]
[2, 3, 4, 1, 5, 6, 7, 8, 9]
[2, 3, 1, 4, 5, 6, 7, 8, 9]
[2, 1, 3, 4, 5, 6, 7, 8, 9]
[1, 2, 3, 4, 5, 6, 7, 8, 9]
"""
