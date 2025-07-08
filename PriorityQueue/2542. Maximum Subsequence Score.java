class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int[][] nums=new int[n][2];
        for(int i=0;i<n;i++){
            nums[i][0]=nums1[i];
            nums[i][1]=nums2[i];
        }
        Arrays.sort(nums,(a,b)->b[1]-a[1]);

        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        long sum=0,max=0;
        for(int i=0;i<n;i++){
            pq1.offer(nums[i][0]);
            sum+=nums[i][0];
            if(pq1.size()>k){
                sum-=pq1.poll();
            }
            if(pq1.size()==k){
                max=Math.max(max,sum*nums[i][1]);
            }
        }
        return max;
    }
}
