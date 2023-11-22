class Solution {
    public String longestPalindrome(String s) {
        int m=0;
        String a="";
        for(int i=0;i<s.length();i++){
            String x=f(i,i,s);
            String y=i<s.length()-1?f(i,i+1,s):"";
            if(x.length()>y.length()){
                if(x.length()>m){
                    a=x;
                    m=x.length();
                }
            }
            else{
                if(y.length()>m){
                    a=y;
                    m=y.length();
                }
            }
        }
        return a;
    }
    static String f(int i,int j,String s){
        int ans=1;
        while(i>=0 && j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                i--;
                j++;
            }
            else{
                break;
            }
        }
        String a="";
        if(i<j){
        a=s.substring(i+1,j);}
        return a;
    }
}