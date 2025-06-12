class Solution {
    public int maxAdjacentDistance(int[] nums) 
    {
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            if(Math.abs(nums[i]-nums[i+1])>ans)
            {
                ans=Math.abs(nums[i]-nums[i+1]);
            }
        }
        if(Math.abs(nums[0]-nums[n-1])>ans)
        {
            ans=Math.abs(nums[0]-nums[n-1]);
        }
        return ans;
        
    }
}