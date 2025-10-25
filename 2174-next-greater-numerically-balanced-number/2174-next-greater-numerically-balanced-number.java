class Solution 
{
    public boolean isbalanced(int n)
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        while(n>0)
        {
            h.put(n%10,h.getOrDefault(n%10,0)+1);
            n=n/10;
        }
        for(int key:h.keySet())
        {
            if(h.get(key)!=key)
            {
                return false;
            }
        }
        return true;
    }
    public int nextBeautifulNumber(int n) 
    {
        int i=n;
        while(true)
        {
            i=i+1;
            if(isbalanced(i))
            {
                return i;
            }
        }
    }
}