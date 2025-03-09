class NumArray 
{
    private int[] ps;

    public NumArray(int[] nums) 
    {

        for(int i=1;i<nums.length;i++)
        {
            nums[i]=nums[i-1]+nums[i];
        }
        this.ps=nums;
    }
    
    public int sumRange(int left, int right) 
    {
        if(left==0)
        {
            return ps[right];
        }
        else
        {
            return ps[right]-ps[left-1];
        }
        //return 0;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */