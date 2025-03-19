class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        int n=numRows;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            List<Integer> temp=new ArrayList<>();
            for(int j=1;j<=i;j++)
            {
                temp.add(1);
            }
            ans.add(temp);
        } 
        for(int i=2;i<n;i++)
        {
            for(int j=1;j<i;j++)
            {
                ans.get(i).set(j,ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
        }
        System.out.println(ans);
        return ans;   
    }
}