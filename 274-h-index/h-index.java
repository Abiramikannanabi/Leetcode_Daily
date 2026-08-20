class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            int p=citations.length-i;
            if(citations[i]>=p){
                return p;
            }
        }
        return 0;
    }
}