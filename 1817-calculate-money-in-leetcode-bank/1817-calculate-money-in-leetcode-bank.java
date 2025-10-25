class Solution {
    public int totalMoney(int n) 
    {
        int sum=0;
        int weeks=n/7;
        int start=0;
        for(int i=0;i<weeks;i++)
        {
            start=i+1;
            System.out.println(start);
            sum+=start;
            for(int j=start+1;j<start+7;j++)
            {
                sum+=j;
                System.out.print(j+" ");
                //System.out.print(sum+" ");
            }
            System.out.println();
        }
        int rem=n-(weeks*7);
        for(int i=start+1;i<start+rem+1;i++)
        {
            System.out.print(i+" ");
            sum+=i;
        }
        return sum;

        
    }
}