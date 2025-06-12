class Solution {
    public int[] plusOne(int[] digits) 
    {
        int n=digits.length;
        int carry=0;
        if(digits[n-1]+1<=9)
        {
            digits[n-1]=digits[n-1]+1;
            return digits;
        }
        else
        {
            carry=1;
            digits[n-1]=0;
            for(int i=n-2;i>=0;i--)
            {
                if(digits[i]+carry<=9)
                {
                    digits[i]=digits[i]+carry;
                    carry=0;
                }
                else
                {
                    digits[i]=(digits[i]+carry)%10;
                    carry=1;
                }
            }
        }
        int ans[]=new int[n+1];
        ans[0]=1;
        if(carry!=1)
        {
            return digits;
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                ans[i+1]=digits[i];
            }
        }
        return ans;
    }
}