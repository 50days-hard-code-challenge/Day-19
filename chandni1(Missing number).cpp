class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=nums.size();
       int  temp=(n+1)*n/2;
        for(int i=0;i<n;i++){
            temp=temp-nums[i];
           
        }
         return temp;
    }
};
