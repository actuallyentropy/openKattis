import datetime
from itertools import permutations

numCases = input()

for case in range(int(numCases)):
    numbers = input()
    part1, part2, part3 = numbers.split()
    numbers = str(part1) + str(part2) + str(part3)
    total = 0
    datelist = []
    bestdate = datetime.date(9999, 12, 31)

    perms = [''.join(p) for p in permutations(numbers)]

    for perm in perms:
        day = perm[:2]
        month = perm[2:4]
        year = perm[4:]

        if int(year) < 2000:
            continue

        try:
            date = datetime.date(int(year), int(month), int(day))

            if date not in datelist:
                datelist.append(date)     
                total = total + 1
                if date < bestdate:
                    bestdate = date
        except ValueError:
            continue

    finaldate = ""
    if not total == 0:
        finaldate = bestdate.strftime("%d %m %Y")
    print(str(total) + " " + finaldate)
            
