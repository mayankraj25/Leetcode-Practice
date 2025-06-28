class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int ans=0;
        int i=0;
        int j=height.length-1;
        while(i!=j){
            if(height[i]<height[j]){
                ans=height[i]*(j-i);
                i++;
            }
            else{
                ans=height[j]*(j-i);
                j--;
            }
            if(ans>max) max=ans;
        }
        return max;
    }
}
