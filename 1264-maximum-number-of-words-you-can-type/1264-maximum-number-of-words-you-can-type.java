class Solution {
    public int canBeTypedWords(String text, String brokenLetters) 
    {
        String[] a=text.split(" ");
        int l=a.length;
        int ans=0;
        for(int i=0;i<l;i++)
        {
            boolean word=true;
            for(int j=0;j<a[i].length();j++)
            {
                if(brokenLetters.indexOf(a[i].charAt(j))!=-1)
                {
                    word=false;
                    break;
                }
            }
            if(word)
            {
                ans++;
            }
        }
      return ans;  
    }
}