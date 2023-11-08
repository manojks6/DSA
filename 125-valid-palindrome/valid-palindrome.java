class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=48 && s.charAt(i)<=57)||(s.charAt(i)>='a' && s.charAt(i)<='z')){
                s1+=s.charAt(i);
            }
        }
        char[] c=s1.toCharArray();
        int i=0,j=c.length-1;
        
        while(i<j){
            if(c[i]!=c[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}