// using recursion
public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int start=0;
        int end=n-1;
        return helper(nums,start,end);

    }
    public static int[] helper(int []nums,int start, int end)
    {
        if(start>end)
        {
           return nums;
        }
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        return helper(nums, start+1, end-1);

    }
}
