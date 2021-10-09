class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,mul=1,rem=0;
        while(n!=0)
        {
            rem=n%10;
            n=n/10;
            sum+=rem;
            mul*=rem;
        }
        int result=mul-sum;
        return result;
    }
}
