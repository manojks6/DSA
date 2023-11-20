class Solution {
    public int maxVowels(String s, int k) {
        int i=0,j=0,n=s.length(),m=0,c=0;
        while(j<n){
            if(isOvel(s.charAt(j))){
                c++;
            }
            if(j-i==k-1){
                m=Math.max(m,c);
                if(isOvel(s.charAt(i))){
                    c--;
                    i++;
                }
                else{
                    i++;
                }
            }
            j++;
        }
        return m;
    }
    static boolean isOvel(char c){
        return c=='a' || c=='e' || c=='i'|| c=='o' || c=='u';
    }
}