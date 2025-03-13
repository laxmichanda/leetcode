class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    {
        int n=items.size();
        int c=0;
        if(ruleKey.equals("type"))
        {
            for(int i=0;i<n;i++)
            {
                if((items.get(i).get(0)).equals(ruleValue))
                {
                    c++;
                }
            }
        }
        else if(ruleKey.equals("color"))
        {
            for(int i=0;i<n;i++)
            {
                if((items.get(i).get(1)).equals(ruleValue))
                {
                    c++;
                }
            }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                if(items.get(i).get(2).equals(ruleValue))
                {
                    c++;
                }
            }
        }
        return c;
    }
}