class Solution 
{
    public int singleNumber(int[] nums)
    {
        int l=nums.length,check=0,a=0;
        
        if(l==1)
        {
            return nums[0];
        }
        Arrays.sort(nums);
        for(int i=0;i<l-2;i=i+2)
        {
            if(nums[i]==nums[i+1])
            {
                check=1;
            }
            else return nums[i];
        }
        return(nums[l-1]); 
    }
}
