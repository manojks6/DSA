class Solution {
    public int minOperations(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0 && s.charAt(i)=='1'){
                c++;
            }
            if(i%2!=0 && s.charAt(i)=='0'){
                c++;
            }
        }  
        int c1=0;
        for(int i=0;i<s.length();i++){
            if(i%2!=0 && s.charAt(i)=='1'){
                c1++;
            }
            if(i%2==0 && s.charAt(i)=='0'){
                c1++;
            }
        }   
        return Math.min(c,c1);
    }
}