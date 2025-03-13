class Solution {
    public int[] finalPrices(int[] prices) 
    {
        int n=prices.length;
        int b[]=new int[n];
        boolean flag=false;
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            if(st.isEmpty())
            {
                b[i]=prices[i];
                st.push(i);
            }
            else if(prices[st.peek()]>prices[i])
                {
                    b[i]=prices[i];
                    while(!st.isEmpty())
                    {
                        st.pop();
                        if(!st.isEmpty() && prices[st.peek()]<=prices[i])
                        {
                            b[i]=prices[i]-prices[st.peek()];
                            flag=true;
                            break;
                        }
                    }
                    

                    st.push(i);
                }
                else
                {
                    b[i]=prices[i]-prices[st.peek()];
                    st.push(i);
                }
            
        }
        return b;
    }
}