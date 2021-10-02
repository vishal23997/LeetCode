class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1)
        {
            return true;
        }
        if(n==0 || n==2)
        {
            return false;
        }
        double x=n;
        int flag=0;
        while(x>1)
        {
            x=x/3;
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
