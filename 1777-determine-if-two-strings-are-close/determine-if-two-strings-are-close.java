class Solution {
    public boolean closeStrings(String word1, String word2) {
        int h1[]=new int[26];
        int h2[]=new int[26];
        HashSet<Character> s1=new HashSet<>();
        HashSet<Character> s2=new HashSet<>();
        for(int i=0;i<word1.length();i++){
            h1[word1.charAt(i)-'a']++;
            s1.add(word1.charAt(i));
        }
        for(int i=0;i<word2.length();i++){
            h2[word2.charAt(i)-'a']++;
            s2.add(word2.charAt(i));
        }
        Arrays.sort(h1);
        Arrays.sort(h2);
        return Arrays.equals(h1,h2) && s1.equals(s2);


    }
}