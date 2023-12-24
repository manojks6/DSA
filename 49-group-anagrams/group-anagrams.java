class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> m=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] p=strs[i].toCharArray();
            Arrays.sort(p);
            String x=new String(p);
            if(!m.containsKey(x)){
                m.put(x,new ArrayList());
                //m.get(x).add(strs[i]);
            }
            m.get(x).add(strs[i]);
        }
        List<List<String>> ans=new ArrayList<List<String>>();
        ans.addAll(m.values());
        return ans;
    }
}