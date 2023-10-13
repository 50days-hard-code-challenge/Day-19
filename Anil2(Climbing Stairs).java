class Solution {
    public int climbStairs(int n) {
        // Recursive Solution
        // Base Case
         
        //  if(n==0){
        //      return 1;
        //  }
        //  if(n==1){
        //      return 1;
        //  }
        //  int count1 = climbStairs(n-1);
        //  int count2 = climbStairs(n-2);
        //  return count1+count2;
         
        // return climbStairs(n-1)+climbStairs(n-2);

        // Using Dynamic Programmming

        // create an array
        int[] dp = new int[n+1];
        for(int i = 0; i<=n; i++){
            dp[i] = -1;
        }
        return helper(n,dp);

    }

    public static int helper(int n, int[] dp){
        // modify the base case
        if(n==0){
            return 1;
        }
        if(n == 1){
           return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = helper(n-1,dp) + helper(n-2,dp);
        return dp[n];
    }
}
