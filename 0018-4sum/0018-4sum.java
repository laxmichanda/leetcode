class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        int n=nums.length;
        Arrays.sort(nums);
        int mod=(int)1e9+7;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n-3;i++)
        {
            for(int j=i+1;j<n-2;j++)
            {
                int low=j+1;
                int high=n-1;
                while(low<high)
                {
                    
                    int sum=(int)((nums[i]+(long)nums[j])%mod+(nums[low]+(long)nums[high])%mod)%mod;
                    if(sum>target)
                    {
                        high--;
                    }
                    else if(sum<target)
                    {
                        low++;
                    }
                    else
                    {
                        //System.out.println(i+" "+j+" "+low+" "+high);
                        if(!ans.contains(Arrays.asList(nums[i],nums[j],nums[low],nums[high])))ans.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                        //System.out.println(ans);
                        low++;
                        high--;
                    }
                }
            }
        }
       return ans; 
    }
}