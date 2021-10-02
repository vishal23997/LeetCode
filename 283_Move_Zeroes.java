class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int x=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]!=0)
            {
                nums[x]=nums[i];
                x++;
            }
        }
        for(int i=x;i<l;i++)
        {
            nums[i]=0;
        }
    }
}
