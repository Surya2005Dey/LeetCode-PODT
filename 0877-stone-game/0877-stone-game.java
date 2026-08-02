// //without memorization  so TLE showing
// class Solution {
//     public boolean stoneGame(int[] piles) {
//         int n=piles.length;
//         int totalScore=0;
//         for(int num:piles){
//             totalScore+=num;
//         }

//         int alice=solve(0,n-1,piles);
//         int bob=totalScore-alice;
//         return alice>bob;
//     }
//     public int solve(int i,int j, int[] piles){
//         if(i>j) return 0;
//         if(i==j) return piles[i];
//         int score_i= piles[i]+Math.min(solve(i+2,j,piles), solve(i+1,j-1,piles));
//         int score_j= piles[j]+Math.min(solve(i,j-2, piles), solve(i+1,j-1,piles));
//         return Math.max(score_i,score_j);
//     }
// }



// //with memorization, NO TLE
// class Solution {
//     Integer[][] dp;
//     public boolean stoneGame(int[] piles) {
//         int n=piles.length;
//         int totalScore=0;
//         dp= new Integer[n][n];
//         for(int num:piles){
//             totalScore+=num;
//         }

//         int alice=solve(0,n-1,piles);
//         int bob=totalScore-alice;
//         return alice>bob;
//     }
//     public int solve(int i,int j, int[] piles){
//         if(i>j) return 0;
//         if(i==j) return piles[i];
//         if(dp[i][j]!=null) return dp[i][j];
//         int score_i= piles[i]+Math.min(solve(i+2,j,piles), solve(i+1,j-1,piles));
//         int score_j= piles[j]+Math.min(solve(i,j-2, piles), solve(i+1,j-1,piles));
//         return dp[i][j]=Math.max(score_i,score_j);
//     }
// }


//Alice always can pick all odd piles or all even tiles , so if odd is high the alice choose
//odd or even is high alice always choose even , so overall alice alwayse win;
class Solution {
    public boolean stoneGame(int[] piles) {
        return true;
    }
   
}


// class Solution {
//     public boolean stoneGame(int[] piles) {
//        int n=piles.length;
//        int oddSum=0;
//        int evenSum=0;
//        for(int i=0;i<n;i++){
//         if(i%2==0) evenSum+=piles[i];
//         else oddSum+=piles[i];
//        }
//        return oddSum!=evenSum;
//     }
   
// }