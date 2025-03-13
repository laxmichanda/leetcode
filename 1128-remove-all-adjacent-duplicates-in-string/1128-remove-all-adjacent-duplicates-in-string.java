class Solution {
    public String removeDuplicates(String s) 
    {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty() || s.charAt(i)!=st.peek())
            {
                st.push(s.charAt(i));
            }
            else if(!st.isEmpty())
            {
                st.pop();
            }
        }
        while(!st.isEmpty())
        {
            ans.append(st.pop());
        }
        return new String(ans.reverse());
    }
}