class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,ans=max;
        if(k*m>bloomDay.length ){
            return -1;
        }
        if(max==min){
            return max;
        }
        for(int i:bloomDay){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        while(min<=max){
            int mx=(min+max)/2;
            int x=f(bloomDay,mx,k);
            if(x>=m){
                ans=mx;
                max=mx-1;
            }
            else{
                min=mx+1;
               
            }
        }
        return f(bloomDay,ans,k)>=m?ans:-1;
    }
    static int f(int a[],int day,int k){
        int f=0,c=0;
        for(int i:a){
            if(i<=day){
                f++;
            }
            else{
                f=0;
            }
            if(f==k){
                c++;
                f=0;
            }
        }
        return c;
    }
}