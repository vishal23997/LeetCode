class Solution {
    public int hammingDistance(int x, int y) {
        int result=(x^y);
        int count=0;
        String str=Integer.toBinaryString(result);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                count++;
            }
        }
        //System.out.println(count);
        return count;
    }
}
