class Solution {
    public int maximumCandies(int[] candies, long k) 
    {
        int n=candies.length;
        int l=1;
        
        int h=10000000;
        int ans=0;
        //System.out.println(max);
        while(l<=h)
        {
            long count=0;
            int mid=l+(h-l)/2;
            //System.out.println(mid);
            for(int j=0;j<n;j++)
            {
                count+=(candies[j]/mid);
                //System.out.print(count+" ");
            }
            //System.out.println();
            if(count>=k)
            {
                ans=mid;
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        return ans;
    }
}