class Solution {
    public int numberOfBeams(String[] bank) 
    {
        int n=bank.length;
        if(n==1) return 0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int len=bank[i].length();
            int ones=0;
            for(int j=0;j<len;j++)
            {
                if(bank[i].charAt(j)=='1')
                {
                    ones++;
                }
            }
            if(ones!=0) list.add(ones);
        }
        int ans=0;
        int temp=list.size();
        for(int i=1;i<temp;i++)
        {
            ans+=(list.get(i)*list.get(i-1));
        }
        return ans;  
    }
}