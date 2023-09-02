class Solution {
    public String reverseWords(String s) {
        String str[]=s.trim().split("\\s+");
        int i=0,j=str.length-1;
        while(i<j){
            String t=str[i];
            str[i]=str[j];
            str[j]=t;
            i++;
            j--;
        }
        String h=str[0];
        for(int k=1;k<str.length;k++){
            h+=" "+str[k];
        }
        return h;
    }
}