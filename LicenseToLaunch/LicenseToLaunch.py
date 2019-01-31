input()
data = input()
splitData = [int(i) for i in data.split()]
print(str(splitData.index(min(splitData))))
