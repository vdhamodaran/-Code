inp = 223336226
s=str(inp)
prev = s[0]
array = []
i = 1
for x in s[1:]:
    if x == prev:
        array.append(s[:i]+s[i+1:])
    i += 1
    prev = x
array.sort()
print int(array[len(array)-1])
