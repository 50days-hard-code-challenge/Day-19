bool isPowerOfTwo(int n)

{   

    // using loop solution

 

    int i=1;

    long long ans = 1;

 

    if(n==1||n==0)

        return true;

    while(i<n)

    {

        ans = ans *2;

 

        if(ans==n)

            return true;

 

        if(ans>n)

            return false;

    }

    return false;

}
