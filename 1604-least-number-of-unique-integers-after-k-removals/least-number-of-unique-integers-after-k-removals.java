class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i:arr){
            l.add(i);
        }
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:l){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        Collections.sort(l,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                int x=m.get(a),y=m.get(b);
                if(x==y){
                    return b-a;
                }
                return x-y;
            }
        });
        int i=0;
        while(k>0){
            l.remove(i);
            k--;
        }
        HashSet<Integer> h=new HashSet<>();
        h.addAll(l);
        return h.size();
    }
}