class Solution {
    public int numberOfSubstrings(String s) 
    {

        int count=0;
        int n=s.length();
        int[] a=new int[3];
        Arrays.fill(a,-1);
        for(int i=0;i<n;i++)
        {
            a[s.charAt(i)-'a']=i;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<3;j++)
            {
                min=Math.min(a[j],min);
            }
            count=count+(min+1);
        }
        return count;
    }
}