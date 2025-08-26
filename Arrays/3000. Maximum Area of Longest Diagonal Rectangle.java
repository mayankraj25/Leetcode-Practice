class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max_val=0;
        int max_index=0;
        for(int i=0;i<dimensions.length;i++){
            int temp=(dimensions[i][0]*dimensions[i][0])+(dimensions[i][1]*dimensions[i][1]);
            if(temp>max_val){
                max_val=temp;
                max_index=i;
            }
            else if(temp==max_val){
                int curr_area=dimensions[i][0]*dimensions[i][1];
                int max_area=dimensions[max_index][0]*dimensions[max_index][1];
                if(curr_area>max_area){
                    max_index=i;
                }
            }
        }
        return dimensions[max_index][0]*dimensions[max_index][1];
    }
}
