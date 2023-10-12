def romanToInt(s:str) -> int:
    # Write your code here
    n=len(s)
    roman={
        "I":1,
        "V":5,
        "X":10,
        "L":50,
        "C":100,
        "D":500,
        "M":1000
    }
    sum=0
    currentSum=0

    for i in range(len(s)):
    

        if(roman[s[i]]<roman[s[i+1]]):
            currentSum*=-1
            continue;
        elif(roman[s[i]]==roman[s[i+1]]):
            currentSum+=roman[s[i]]
            continue;
        else:
            currentSum+=roman[s[i]]
        sum+=currentSum
    return sum

        
