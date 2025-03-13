class Solution {
    public boolean backspaceCompare(String s, String t) 
    {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        int m=s.length();
        int n=t.length();
        for(int i=0;i<m;i++)
        {
            if( !st1.isEmpty() && s.charAt(i)=='#')
            {
                st1.pop();
            }
            else if(s.charAt(i)!='#')
            {
                st1.push(s.charAt(i));
            }
        }
        for(int i=0;i<n;i++)
        {
            if( !st2.isEmpty() && t.charAt(i)=='#')
            {
                st2.pop();
            }
            else if(t.charAt(i)!='#')
            {
                st2.push(t.charAt(i));
            }
        }
        StringBuilder ans1=new StringBuilder();
        StringBuilder ans2=new StringBuilder();
        
        while(!st1.isEmpty())
        {
            ans1.append(st1.pop());
        }
        while(!st2.isEmpty())
        {
            ans2.append(st2.pop());
        }
        System.out.println(ans1+" "+ans2);
        if(new String(ans1).equals(new String(ans2)))
        {
            return true;
        }
        return false;
    }
}