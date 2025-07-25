/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=1;
        int h=n;
        while(l<=h){
            int mid = l + (h - l) / 2;
            if(guess(mid)==0){
                return mid;
            }
            else if(guess(mid)==-1){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return 0;
    }
}
