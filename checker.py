import os
import re
import csv

def ignoreLine(line):
    if len(line) <= 2:
        return True
    if re.match(r'^{|import|public|Scanner', line):
        return True
    else:
        return False

def plug(f1List, f2List):
    f1size = len(f1List)
    f2size = len(f2List)
    matchCount = 0

    for line in range(0, min(f1size, f2size)):
        if(f1List[line] == f2List[line]):
            matchCount += 1
    
    prob = (matchCount * 100.0) / max(f1size, f2size)
    return prob


sourceFileList = os.listdir(os.path.join(os.getcwd(), "codes"))

for sourceFile in sourceFileList:
    fp = open(os.path.join("codes", sourceFile), "r")
    fileName = os.path.splitext(sourceFile)[0]
    
    wp = open(os.path.join("token", fileName + ".txt"), "w")
    for lines in fp:
        l = lines.strip()
        l = l.replace(" ", "")
        if not ignoreLine(l):
            wp.write(l + "\n")

    wp.close()


tokenFileList = os.listdir(os.path.join(os.getcwd(), "token"))

csvFile = open("result.csv", "w", newline='')
fileList = ["tempo"]

for f in tokenFileList:
    fileName = os.path.splitext(f)[0]
    fileList.append(fileName)

csvWritter = csv.DictWriter(csvFile, fieldnames=fileList)
csvWritter.writeheader()



for i in range(0, len(tokenFileList)-1):
    f1 = tokenFileList[i]
    file1 = open(os.path.join("token", f1), "r")
    
    f1List = []
    for line in file1:
        f1List.append(line)

    file1.close()

    rowDict = {}
    rowDict["tempo"] = os.path.splitext(f1)[0]

    # csvWritter.writerow(rowDict)

    # print(os.path.splitext(f1)[0] + " -- >", end= ' ')

    for j in range(i+1, len(tokenFileList)):
        f2 = tokenFileList[j]
        file2 = open(os.path.join("token", f2), "r")
        f2List = []

        for line in file2:
            f2List.append(line)
        
        prob = plug(f1List, f2List)

        rowDict[os.path.splitext(f2)[0]] = int(prob)
        # print("{} = {} |".format(os.path.splitext(f2)[0], prob), end=' ')
    # print()
    csvWritter.writerow(rowDict)

print("DONE :D")

