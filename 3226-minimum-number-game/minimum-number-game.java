class Solution {
    public int[] numberGame(int[] a) {
        Arrays.sort(a);
        for(int i=1;i<a.length;i+=2){
            int t=a[i];
            a[i]=a[i-1];
            a[i-1]=t;
        }    
        return a;
    }
}