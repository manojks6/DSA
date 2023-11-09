class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        s=s.replaceAll("\\s+"," ");
        String[] x=s.split(" ");
        int i=0,j=x.length-1;
        while(i<j){
            String t=x[i];
            x[i]=x[j];
            x[j]=t;
            i++;
            j--;
        }
        String k=x[0];
        for(int i0=1;i0<x.length;i0++){
            k+=" "+x[i0];
        }
        return k;
    }
}