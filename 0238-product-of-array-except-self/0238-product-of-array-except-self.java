class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n=nums.length;
        int zeroes=0;
        int ans[]=new int[n];
        int pro=1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                zeroes++;
            }
            if(nums[i]!=0)
            pro=pro*nums[i];
        }
        System.out.println(pro);
        if(zeroes>=2)
        {
            Arrays.fill(ans,0);
            return ans;
        }
        else if(zeroes==1)
        {
            for(int i=0;i<n;i++)
            {
                if(nums[i]==0)
                {
                    ans[i]=pro;
                    
                }
                else
                {
                    ans[i]=0;
                }
            }
            return ans;
        }
        for(int i=0;i<n;i++)
        {
            
            ans[i]=pro/nums[i];
            
        }
        return ans;

    //     int prefix[]=new int[n];
    //     int suffix[]=new int[n];
    //     prefix[0]=nums[0];
    //     suffix[n-1]=nums[n-1];

    //     for(int i=1;i<n;i++)
    //     {
    //         prefix[i]=prefix[i-1]*nums[i];
    //     }
    //     for(int i=n-2;i>=0;i--)
    //     {
    //         suffix[i]=suffix[i+1]*nums[i];
    //     }
    //     for(int i=0;i<n;i++)
    //     {
    //         if(i==0)
    //         {
    //             ans[i]=suffix[i+1];
    //         }
    //         else if(i==n-1)
    //         {
    //             ans[i]=prefix[i-1];
    //         }
    //         else
    //         {
    //             ans[i]=prefix[i-1]*suffix[i+1];
    //         }
    //     }
    //   return ans;  
    }
}