class Solution {
    public int maxSubArray(int[] nums) 
    {
        int max=nums[0];
        int sum=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
           sum=Math.max(nums[i],nums[i]+sum);
           max=Math.max(sum,max);
        }
        return max;
    }
}