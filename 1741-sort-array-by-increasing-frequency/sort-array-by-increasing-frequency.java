class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int c:nums){
            int x=m.getOrDefault(c,0);
            m.put(c,x+1);
        }
        List<Integer> l=new ArrayList<>();
        for(int i:nums){
            l.add(i);
        }
        Collections.sort(l,(a,b)->{
            if(m.get(a)==m.get(b)){
                return b-a;
            }
            return m.get(a)-m.get(b);
        });
        for(int i=0;i<nums.length;i++){
            nums[i]=l.get(i);
        }
        return nums;
    }
}