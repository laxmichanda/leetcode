class Solution 
{
    public boolean containszero(int x)
    {
        while(x>0)
        {
            if(x%10==0)return true;
            x=x/10;
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) 
    {
        int[] ans=new int[2];
        for(int i=1;i<n;i++)
        {
            int a=i;
            int b=n-i;
            if(!containszero(a) && !containszero(b))
            {
                
                ans[0]=a;
                ans[1]=b;
                return ans;
            }
        }
       return ans; 
    }
}