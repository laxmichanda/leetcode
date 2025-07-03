class Solution 
{
    public char kthCharacter(int k) 
    {
         char[] dp=new char[501];
         StringBuilder temp=new StringBuilder();
        temp.append('a');
        while(temp.length()<=501)
        {
            StringBuilder append=new StringBuilder();
            int n=temp.length();
            for(int i=0;i<n;i++)
            {
                append.append((temp.charAt(i)!='z')?(char)(temp.charAt(i)+1):'a');
                //System.out.println(append);
            }
            temp.append(append);
            //System.out.println("    "+temp);
        }
        String s=new String(temp);
        dp=s.toCharArray();
   
        return dp[k-1];

        
    }
}