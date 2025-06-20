class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] temp=new int[n];
        int a=0;
        int b=0;
        int i=0;
        while(a < nums1.length && b < nums2.length){
            if(nums1[a]>nums2[b]){
                temp[i]=nums2[b];
                b++;
            }
            else{
                temp[i]=nums1[a];
                a++;
            }
            i++;
        }
        while(a!=nums1.length){
            temp[i++]=nums1[a++];
        }
        while(b!=nums2.length){
            temp[i++]=nums2[b++];
        }

        double median=0;
        int m_length=temp.length;
        if(m_length%2==0){
            median=(temp[m_length/2] + temp[(m_length/2)-1])/2.0;
        }
        else{
            median=temp[m_length/2];
        }
        return median;
    }
}
