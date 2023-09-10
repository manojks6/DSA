class Solution {
    public String longestPalindrome(String str) {
		int m=0;
		String ans="";
		for(int i=0;i<str.length();i++){
			String x=f(str,i,i);
			String y=f(str,i,i+1);
			if(x.length()>y.length() &&x.length()>m ){
				m=Math.max(x.length(),m);
				ans=x;
			}
			else if(y.length()>m){
				m=Math.max(y.length(),m);
				ans=y;
			}
		}
		return ans;
	}
	static String f(String s,int i,int j){
		while(i>=0 && j<s.length()){
			if(s.charAt(i)==s.charAt(j)){
				j++;
				i--;
			}
			else{
				break;
			}
		}
		String x=s.substring(i+1,j);
		return x;
	}        

}