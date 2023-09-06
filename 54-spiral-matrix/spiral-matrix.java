class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> l0=new ArrayList<>();
        int m1=m[0].length,l=0,t=0,n=m.length,r=m1-1,b=n-1;
        while(l<=r && t<=b){
            for(int j=l;j<=r;j++){
                l0.add(m[t][j]);
            }
            t++;
            for(int j=t;j<=b;j++){
                l0.add(m[j][r]);
            }
            r--;
            if(t<=b){
                for(int j=r;j>=l;j--){
                    l0.add(m[b][j]);
                }
            }
            b--;
            if(l<=r){
                for(int j=b;j>=t;j--){
                    l0.add(m[j][l]);
                }
            }
            l++;
        }
        return l0;
    }
}