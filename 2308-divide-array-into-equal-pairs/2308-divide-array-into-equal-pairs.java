class Solution {
    public boolean divideArray(int[] nums) 
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        for(int i:h.keySet())
        {
            if(h.get(i)%2==0)
            {
                count+=(h.get(i))/2;
            }
            else
            {
                return false;
            }
        }
       return count==(n/2); 
    }
}