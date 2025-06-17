class Solution {
    public int maxCoins(int[] piles) {
        int ans=0;
        int count=0;
        Arrays.sort(piles);
        int i=(piles.length)-2;
        while(count!=piles.length/3){
            ans+=piles[i];
            i-=2;
            count++;
        }
        return ans;
    }
}
