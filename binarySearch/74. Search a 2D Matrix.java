class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l1=0;
        int r1=matrix.length-1;
        while(l1<=r1){
            int mid=l1+(r1-l1)/2;
            int l2=0;
            int r2=(matrix[mid].length)-1;
            if(matrix[mid][l2]>target){
                r1=mid-1;
            }
            else if(matrix[mid][r2]<target){
                l1=mid+1;
            }
            else{
                while(l2<=r2){
                    int mid1=l2+(r2-l2)/2;
                    if(matrix[mid][mid1]==target){
                        return true;
                    }
                    else if(matrix[mid][mid1]>target){
                        r2=mid1-1;
                    }
                    else if(matrix[mid][mid1]<target){
                        l2=mid1+1;
                    }
                }
                break;
                
            }
        }
        return false;

    }
}
