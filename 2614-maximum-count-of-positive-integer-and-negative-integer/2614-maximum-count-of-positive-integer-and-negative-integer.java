class Solution {
    public int maximumCount(int[] nums) 
    {
        int n=nums.length;
        //System.out.println(n);
        int l=0;
        int h=n-1;
        int ceil=-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]>0)
            {
                ceil=mid;
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        l=0;
        h=n-1;
        int floor=-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]<0)
            {
                floor=mid;
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        if(ceil!=-1 && floor !=-1)
        {
            return Math.max(floor+1,n-ceil);
        }
        else if(ceil==-1 && floor==-1)
        {
            return 0;
        }
        else if(ceil==-1 && floor!=-1)
        {
            return floor+1;
        }
        else
        {
            return n-ceil;
        }
    }
}