class Solution {
    public String reverseWords(String s) {
        s=s.trim();
       String c[]=s.split(" +");
        int l=0,r=c.length-1;
        while(l<r){
            String dum=c[l];
            c[l]=c[r];
            c[r]=dum;
            l++;r--;
        }
        return String.join(" ",c);
    }
}