"""
Merge Sort Complexity O(n logn)
"""
list = [9,8,7,6,5,4,3,2,1]

def mergeSort(l):
    if len(l) <= 1:
        return l
    mid = len(l) // 2
    left = mergeSort(l[:mid])
    right = mergeSort(l[mid:])
    print left,right
    return merge(left,right)
def merge(left,right):
    if not left:
        return right
    if not right:
        return left
    if left[0] <  right[0]:
        return [left[0]] +  merge(left[1:],right)
    return [right[0]] +  merge(left,right[1:])

print mergeSort(list)
