class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(m.containsKey(nums[i])){
                m.put(nums[i], m.get(nums[i])+1);
            }
            else{
                m.put(nums[i],1);
            }
        }
        int n=nums.length/2;
        int res=0;
        for(Map.Entry<Integer,Integer> en: m.entrySet()){
            if(en.getValue()>n){
                res=en.getKey();break;
            }
        }
        return res;
    }
}