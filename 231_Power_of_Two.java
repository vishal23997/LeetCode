class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
        {
            return true;
        }
        if(n==0)
        {
            return false;
        }
        double x=n;
        int flag=0;
        while(x>1)
        {
            x=x/2;
            if(x==1)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            return true;
        else return false;
    }
}
