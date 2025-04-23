class Solution 
{
    static int sum(int n)
    {
        int s=0;
        while(n>0)
        {
            s+=(n%10);
            n=n/10;
        }
        return s;
    }
    public int countLargestGroup(int n) 
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++)
        {
            int temp=sum(i);
            System.out.println(temp);
            h.put(temp,h.getOrDefault(temp,0)+1);
            if(h.get(temp)>ans)
            {
                ans=h.get(temp);
            }
        }
        int count=0;
        for(int i:h.keySet())
        {
            if(h.get(i)==ans)
            {
                count++;
            }
        }  
        return count;
    }
}