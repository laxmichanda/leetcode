class Solution {
    public List<String> summaryRanges(int[] nums) 
    {
        int n=nums.length;
        List<String> result=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            temp.add(nums[i]);
            if( i==n-1 || (nums[i]+1!=nums[i+1]))
            {
                ans.add(new ArrayList<>(temp));
                temp=new ArrayList<>();
            } 
        }
        System.out.println(ans);
        
         for (List<Integer> sublist : ans) {
            if (sublist.size() == 1) {
                result.add(String.valueOf(sublist.get(0)));
            } else if (!sublist.isEmpty()) {
                int start = sublist.get(0);
                int end = sublist.get(sublist.size() - 1);
                result.add(start + "->" + end);
            }
        }
     
        return result;
        
    }
}