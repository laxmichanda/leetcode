class Solution 
{
    static List<List<Integer>> dp=new ArrayList<>();
    static void fill()
    {
        List<Integer> temp=new ArrayList<>();
        temp.add(1);
        dp.add(new ArrayList<>(temp));
        temp.clear();
        for(int i=1;i<34;i++)
        {   
            temp.add(1);
            for(int j=1;j<i;j++)
            {
                temp.add(dp.get(i-1).get(j-1)+dp.get(i-1).get(j));
            }
            temp.add(1);
            dp.add(new ArrayList<>(temp));
            temp.clear();
            //System.out.println(dp);
        }
        return;
    }

    public List<Integer> getRow(int rowIndex) 
    {
        fill();
        return dp.get(rowIndex);    
    }
}