class Solution {
    public int minSteps(String s, String t) {
        int a[]=new int[26];
        Arrays.fill(a,0);
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;
        }
        int sum=0;
        for(int i:a){
            sum+=i>0?i:0;
        }
        return sum;
    }
}