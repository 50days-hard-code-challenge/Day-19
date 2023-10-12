class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int  totalsum=0;
        int n=cardPoints.length;
        int sum[]=new int[n];
        // card array total sum.
        for(int i=0;i<n;i++)
        {
            totalsum+=cardPoints[i];
            sum[i]=totalsum;
        }
        if(n==k)
        {
            return totalsum;
        }
        // total sum - non counting cards points;
        int score=0;
        int temp=0;
        for(int i=0;i<=k;i++)
        {
            int j=i+n-1-k;
            if(i==0)
            {
                temp=sum[j];
            }
            else
            {
                temp=sum[j]-sum[i-1];
            }
            score=Math.max(score,totalsum-temp);
        }
        return score;
        
    }
}
