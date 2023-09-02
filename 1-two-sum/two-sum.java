class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m=new HashMap<>();
        int x[]=new int[2];
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if( m.containsKey(target-nums[i]) && m.get(target-nums[i])!=i ){
                x[0]=i;
                x[1]=m.get(target-nums[i]);
                break;
            }
        }
        return x;
    }
}