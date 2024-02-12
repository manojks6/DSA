class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0;
        for(int i=0;i<columnTitle.length();i++){
            int x=(columnTitle.charAt(i)-'A')+1;
            sum*=26;
            sum+=x;
        }
        return sum;
    }
}