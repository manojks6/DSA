class Solution {
    public String largestOddNumber(String num) {
        String s="";
        int ans=-1;
        for(int i=num.length()-1;i>=0;i--){
            if(Integer.parseInt(""+num.charAt(i))%2!=0){
                ans=i;
                break;
            }
        }
        if(ans==-1){
            return "";
        }
        s=num.substring(0,ans+1);
        return s;
    }
}