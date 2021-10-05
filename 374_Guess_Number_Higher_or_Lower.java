/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long mid,min=1,max=n;
        int temp=0;
        while(true)
        {
           mid=(min+max)/2;
            temp=guess((int)mid);
            if(temp==0)
            {
                break;
            }
            else if(temp==1)
            {
                min=mid+1;
            }
            else if(temp==-1)
                max=mid-1;
        }
        return (int)mid;
    }
}
