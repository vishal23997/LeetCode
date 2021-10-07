class Solution {
    public int maximumProduct(int[] nums) {
        int multiply1=0,multiply2=0;
        int l=nums.length;
        Arrays.sort(nums);
        multiply1=nums[l-1]*nums[l-2]*nums[l-3];
        multiply2=nums[0]*nums[1]*nums[l-1];
        if(multiply1>multiply2)
            return multiply1;
        else
            return multiply2;
    }
}
