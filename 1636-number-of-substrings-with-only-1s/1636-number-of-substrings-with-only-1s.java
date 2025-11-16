class Solution {
    public int numSub(String s) 
    {
        int mod=(int)1e9+7;
        int n=s.length();
        int ans=0;
        int ones=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                ones++;
                ans=(ans%mod+ones%mod)%mod;
            }
            else
            {
                ones=0;
            }
        }
        return ans;
    }
}