import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
 PriorityQueue<Integer> p = new PriorityQueue<Integer>();
         for(int i:nums){
            p.add(-1*i);
        }
        int x=0;
        while(k--!=1){
            p.poll();
        }
        return -1*p.peek();
    }
}