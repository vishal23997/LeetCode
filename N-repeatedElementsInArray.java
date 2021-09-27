class Solution {
    public int repeatedNTimes(int[] nums) {
        int l=nums.length;
        int half=l/2;
        int count=0;
        for(int i=0;i<l;i++)
        {
            for(int j=i;j<l;j++)
            {
                 if(nums[i]==nums[j])
                    count++;
                    if(count==half)
                        return nums[i];
            } count=0;   
        }
             
        return 0;
    }
}
