class Solution {
    public int[] sumZero(int n) 
    {
        List<Integer> list=new ArrayList<>();
        int k=n/2;
            for(int i=1;i<=k;i++)
            {
                list.add(i);
                list.add(-1*i);
            }
        if(n%2!=0)list.add(0);
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
    }
}