class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String c[]=s.split(" +");
        String str=c[c.length-1];
        return str.length();
        
    }
}