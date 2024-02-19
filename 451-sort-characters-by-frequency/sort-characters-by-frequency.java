class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray()){
            int x=m.getOrDefault(c,0);
            m.put(c,x+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->(m.get(b)-m.get(a)));
        for(char c:m.keySet()){
           pq.add(c);
        }
        StringBuilder str=new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            int frequency = m.get(c);
            for (int i = 0; i < frequency; i++) {
                str.append(c);
            }
        }
        return str.toString();
    }
}