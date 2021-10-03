class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(s.indexOf(chars[i]) == s.lastIndexOf(chars[i]))
                return i;
        }
        return -1;
    }
}
