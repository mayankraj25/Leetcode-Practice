class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int ans=0;
        int left=1;
        int right=x;
        while(left<=right){
            int mid=left+(right-left)/2;
            long sqr=(long)mid*mid;
            if(sqr==x) return mid;
            else if(sqr>x){
                right=mid-1;
            }
            else{
                left=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}
