class Solution {
    public String largestNumber(int[] nums) 
    {
        int n=nums.length;
        String[] a=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(a,(x,y)->(y+x).compareTo(x+y));
        StringBuilder ans=new StringBuilder();
        if(a[0].equals("0"))
        {
            return "0";
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                ans.append(a[i]);
            }
            return ans.toString();
        }
        
    }
}