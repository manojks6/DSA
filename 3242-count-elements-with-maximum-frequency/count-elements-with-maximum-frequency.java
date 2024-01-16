class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int mx=0,c=0;
            
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
           mx=Math.max(mx,e.getValue());
        }
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            if(e.getValue()==mx){
                c+=e.getValue();
            }
        }
        return c;
    }
}