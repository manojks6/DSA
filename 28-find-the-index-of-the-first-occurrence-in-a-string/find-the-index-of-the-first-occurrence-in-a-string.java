class Solution {
    public int strStr(String haystack, String needle) {
        int x=f(haystack.toCharArray(),needle.toCharArray());
        return x==-1?-1:x;
    }
    static int f(char[] t,char[] p){
		for(int i=0;i<t.length;i++) {
			int j=0,k=i;
			while(j<p.length && k<t.length && t[k]==p[j] ) {
				j++;
				k++;
			}
			if(j>=p.length) {
				return i;
			}
		}
        return -1;
	}
}