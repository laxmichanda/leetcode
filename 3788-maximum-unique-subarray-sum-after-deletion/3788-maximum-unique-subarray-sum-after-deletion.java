class Solution {
    public int maxSum(int[] nums) 
    {
        HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> hn=new HashSet<>();
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
            {
                
                if(nums[i]>0)
                h.add(nums[i]);
                else
                {
                    max=Math.max(max,nums[i]);
                    hn.add(nums[i]);
                }
            }
        int sum=0;
        Iterator<Integer> itr=h.iterator();    
      while(itr.hasNext()){    
        sum=sum+itr.next();}
         int sumn=0;
        Iterator<Integer> itrn=hn.iterator();    
      while(itrn.hasNext()){    
        sumn=sumn+itrn.next();}
        if(sum==0)
        {
            return max;
        }
        return sum;
    }
}