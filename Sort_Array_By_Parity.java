class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int l=nums.length,x=0,y=0;
        int[] a= new int[l/2];
        int[] b= new int[l/2];
        int[] c= new int[l];
        for(int i=0;i<l;i++)
        {
            if(nums[i]%2==0)
            {
                a[x]=nums[i];
                x++;
            }
            else
            {
                b[y]=nums[i];
                y++;
            }
        }
        x=0;
        y=1;
        for(int k=0;k<l/2;k++)
        {
            c[x]=a[k];
            c[y]=b[k];
            x=x+2;
            y=y+2;
        }
        return c;
        
    }
}
