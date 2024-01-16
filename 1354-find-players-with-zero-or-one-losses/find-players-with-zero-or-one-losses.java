class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        ArrayList<List<Integer>> ans=new  ArrayList<List<Integer>>();
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> mw=new HashMap<>();
        HashMap<Integer,Integer> ml=new HashMap<>();
        for(int x[]:matches){
            mw.put(x[0],mw.getOrDefault(x[0],0)+1);
            ml.put(x[1],ml.getOrDefault(x[1],0)+1);
        }
        for(Map.Entry<Integer,Integer> e :mw.entrySet()){
            if(!ml.containsKey(e.getKey())){
               l.add(e.getKey());
            }
        }
        Collections.sort(l);
        ans.add(l);
        l=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e :ml.entrySet()){
            if(e.getValue()==1){
                l.add(e.getKey());
            }
        }
        Collections.sort(l);
        ans.add(l);        
        return ans;
    }
}