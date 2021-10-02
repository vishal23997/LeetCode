class Solution {
    public int majorityElement(int[] nums) {
        int element=0,count=0,i=0;
        while(i<nums.length)
        {
            if(count==0)
            {
                element=nums[i];
            }
            if(element==nums[i])
            {
                count++;
            }
            else
                count--;
            i++;
        }
        return element;
    }
}
