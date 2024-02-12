class Solution {
    public int[] sortByBits(int[] arr) {
        ArrayList<Integer> p=new ArrayList<>();
        for(int i : arr){
            p.add(i);
        }
        Collections.sort(p,new Comparator<Integer>(){
            public int compare(Integer x,Integer y){
                int a=Integer.bitCount(x),b=Integer.bitCount(y);
                if(a-b==0){
                    return x-y;
                }
                return a-b;
            }
        });
        int ans[]=new int[arr.length],k=0;
        for(int i:p){
            ans[k++]=i;
        }
        return (ans);
    }
}