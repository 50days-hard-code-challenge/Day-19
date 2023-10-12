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

        if(i==n-1):
            currentSum+=roman[s[i]]
            sum+=currentSum
            break
        if(roman[s[i]]<roman[s[i+1]]):
            currentSum+=roman[s[i]]
            currentSum*=-1
        else:
            currentSum+=roman[s[i]]
        sum+=currentSum
        currentSum=0
    return sum
