class Solution {
    public boolean isSubsequence(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        int i,j,temp=0,flag=0,count=0;
        if(l1==0)
            return true;
        if(l2==0)
            return false;
        for(i=0;i<l1;i++)
        {
            for(j=temp;j<l2;j++)
            {
                if(s.charAt(i)==t.charAt(j))
                {
                    temp=j+1;
                    flag=1;
                    count++;
                    break;
                }
            }
            if(flag==0)
                break;
            flag=0;
        }
        if(count==l1)
            return true;
        else return false;
    }
}
