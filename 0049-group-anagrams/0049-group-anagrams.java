class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> ans=new ArrayList<>();
        List<List<Integer>> index=new ArrayList<>();
        int n=strs.length;
        String sort[]=new String[n]; 
        for(int i=0;i<n;i++)
        {
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            sort[i]=new String(c);
        }
        for(int i=0;i<n;i++)
        {
            boolean found=false;
           for(int j=0;j<ans.size();j++)
           {
            
            if(sort[index.get(j).get(0)].equals(sort[i]))
            {
                found=true;
                ans.get(j).add(strs[i]);
                index.get(j).add(i);
            }
           
           }
           if(!found)
            {
                ans.add(new ArrayList<>());
                index.add(new ArrayList<>());
                ans.get(ans.size()-1).add(strs[i]);
                index.get(index.size()-1).add(i);
            }
          //System.out.println(ans); 
        }
       return ans; 
    }
}