class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        
        int[] temp=new int[score[0].length];
        for(int i=0;i<score.length;i++){
            int max=i;
            for(int j=i;j<score.length;j++){
                if(score[j][k]>score[max][k]){
                max=j;
                }
            }
            temp=score[i];
            score[i]=score[max];
            score[max]=temp;
        }
        return score;
    }
}
