class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> m1=new HashSet<>();
        Set<Integer> m2=new HashSet<>();
        List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        for(int i:nums1){
            m1.add(i);
        }
        for(int i:nums2){
            m2.add(i);
        }
        for(int i:m2){
            if(!m1.contains(i)){
                ans2.add(i);
            }
        }
        for(int i:m1){
            if(!m2.contains(i)){
                ans1.add(i);
            }
        }
        result.add(ans1);
        result.add(ans2);
        return result;
    }
}
