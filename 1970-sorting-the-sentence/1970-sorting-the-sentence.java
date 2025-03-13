class Solution {
    public String sortSentence(String s) 
    {
        String[] temp=s.split(" ");
        int n=temp.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(temp[i]+" ");
        }
        System.out.println();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
            int l=temp[i].length();
            int ind=Integer.parseInt(temp[i].substring(l-1,l));
            a[ind-1]=temp[i].substring(0,l-1);
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            ans.append(a[i]);
            if(i!=n-1)
            {
                ans.append(" ");
            }
        }
        return new String(ans);
    }
}