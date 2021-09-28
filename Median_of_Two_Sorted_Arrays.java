class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int c1=a+b;
        double sum=0;
        double[] c = new double[c1];
        for(int i=0;i<a;i++)
        {
            c[i]=nums1[i];
        }
        for(int i=0;i<b;i++)
        {
            c[a+i]=nums2[i];
        }
        Arrays.sort(c);
        int l=c.length;
        if(l%2==0)
        {
            sum=(c[l/2]+c[(l/2)-1])/2;
        }
        else
        {
            sum=(c[l/2]);
        }
        return sum;
    }
}
