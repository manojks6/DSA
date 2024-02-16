class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++){
            c+=Integer.parseInt(details[i].substring(11,13))>60?1:0;
        }
        return c;
    }
}