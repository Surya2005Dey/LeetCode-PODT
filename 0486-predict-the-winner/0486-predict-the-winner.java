// //without memorization
// class Solution {
//     public boolean predictTheWinner(int[] nums) {
//         int n=nums.length;
//         int totalScore=0;
//         for(int num: nums){
//             totalScore+=num;
//         }
//         int score_p1=solve(0,n-1,nums);
//         int score_p2=totalScore-score_p1;
//         return score_p1>=score_p2;
//     }
//     public int solve(int i, int j, int[] nums){
//         if(i>j) return 0;
//         if(i==j) return nums[i];
//         int score_i= nums[i]+ Math.min(solve(i+2,j,nums), solve(i+1,j-1, nums));
//         int score_j=nums[j]+Math.min(solve(i,j-2,nums), solve(i+1,j-1,nums));
//         return Math.max(score_i,score_j);
//     }
// }


//with memorization / DP

class Solution {
    Integer[][] dp;
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        dp=new Integer[n][n];
        int totalScore=0;
        for(int num: nums){
            totalScore+=num;
        }
        int score_p1=solve(0,n-1,nums);
        int score_p2=totalScore-score_p1;
        return score_p1>=score_p2;
    }
    public int solve(int i, int j, int[] nums){
        if(i>j) return 0;
        if(i==j) return nums[i];
        if(dp[i][j]!=null) return dp[i][j];
        int score_i= nums[i]+ Math.min(solve(i+2,j,nums), solve(i+1,j-1, nums));
        int score_j=nums[j]+Math.min(solve(i,j-2,nums), solve(i+1,j-1,nums));
        return dp[i][j]=Math.max(score_i,score_j);
    }
}