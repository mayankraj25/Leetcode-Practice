class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        for(int num:nums){
            pq1.add(num);
            if(pq1.size()>k){
                pq1.poll();
            }
        }
        return pq1.peek();
    }
}
