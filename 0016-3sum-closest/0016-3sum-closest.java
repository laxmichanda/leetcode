class Solution {
    public int threeSumClosest(int[] nums, int target) 
    {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum=0;
                for(int k=j+1;k<n;k++)
                {
                    sum=nums[i]+nums[j]+nums[k];
                    if(Math.abs(target-sum)<Math.abs(target-ans))
                    {
                        ans=sum;
                    }
                }
                //System.out.println(sum);
                
            }
        }
        return ans;
    }
}