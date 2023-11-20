class Solution {
    public int maxPower(String s) {
        if(s.length()==0 || s.length()==1){
            return s.length();
        }
        int i=0,j=1,m=0,c=1;
        while(j<s.length()){
            if(s.charAt(j)-s.charAt(j-1)==0){
                c++;
            }
            else{
                c=1;   
            }
            if(c>m){
                m=c;
            }
            j++;
        }
        return m;
    }
}