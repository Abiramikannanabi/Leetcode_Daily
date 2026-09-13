class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count=0,prev=Integer.MIN_VALUE,max=0;
        for(int i:set){
            if(i==prev+1){
                count++;
            }else{
                count=1;
            }
            max=Math.max(max,count);
            prev=i;
        }
        return max;
    }
}