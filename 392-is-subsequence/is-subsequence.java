class Solution {
    public boolean isSubsequence(String s, String t) {
        Stack<Character> st=new Stack<Character>();
        for(char c:s.toCharArray()){
            st.push(c);
        }
        for(int i=t.length()-1;i>=0;i--){
            if(!st.isEmpty() && st.peek()==t.charAt(i)){
                st.pop();
            }
        }
        return st.isEmpty();
    }
}