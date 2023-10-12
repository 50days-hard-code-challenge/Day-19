def isCyclicRotation(p: str, q: str) -> int:
    # Write your code here.
    n=len(p)
    r=p+p

    for i in range(n):
        if r[i:i+n:]==q:
            return 1
    return 0
    pass
