class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
       
        s = s.trim();
        int l=s.length();
        for(int i=l-1;i>-1;i--)
        {
            if(s.charAt(i)==' ')
                break;
            else
                count++;
        } 
        return count;
    }
}
