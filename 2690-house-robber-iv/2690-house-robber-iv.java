class Solution 
{
    public boolean canRob(int nums[],int mid,int k)
    {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<=mid)
            {
                count++;
                i++;
            }
        }
        return count>=k;
    }
    public int minCapability(int[] nums, int k) 
    {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        int l=1;
        int h=max;
        int ans=max;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(canRob(nums,mid,k))
            {
                ans=mid;
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
    }
}