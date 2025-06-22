class Solution {
    public String convert(String s, int numRows) 
    {
        if(numRows==1)
        {
            return s;
        }
        List<List<Character>> temp=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            temp.add(new ArrayList<>());
        }
        int p=0;
        int n=s.length();
        boolean down=false;
        int count=0;
        int rc=numRows-1;
        for(int i=0;i<n;i++)
        {
            temp.get(p).add(s.charAt(i));
            
            
            if(p==0)down=true;
            
            else if(p==numRows-1)
            {
              down=false;
            }
            p+=(down==true)?1:-1;
            
        }
       StringBuilder st=new StringBuilder();
       for(int i=0;i<numRows;i++)
       {
            for(int j=0;j<temp.get(i).size();j++)
            {
                st.append(temp.get(i).get(j));
            }
       } 
       return new String(st);
    }
}