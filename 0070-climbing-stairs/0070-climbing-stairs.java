//BEST SOLUTION , NO MEMORY, O(N)

class Solution {
    public int climbStairs(int n) {
       if(n<=2) return n;
       int first=1, second=2;
       for(int i=3;i<=n;i++){
        int curr= first+second;
        first =second;
        second=curr;
       }
       
        return second;
    }
}


// BOTTOM-UP(TABULATION)

// class Solution {
//     public int climbStairs(int n) {
//        if(n<=2) return n;
//        int[] dp=new int[n+1];
//        dp[1]=1;
//        dp[2]=2;
//        for(int i=3;i<=n;i++){
//         dp[i]=dp[i-1]+dp[i-2];
//        }
       
//         return dp[n];
//     }
// }

//DYNAPIC PROGRAMING/ MEMORIZATION / TOP DOWN

// class Solution {
//     int[] dp= new int[46];
//     public int climbStairs(int n) {
//        if(n<=2) return n;
//        if(n==1) dp[n]=1;
//        if(n==2) dp[n]=2;
//        if(dp[n]!=0) return dp[n];
//        dp[n]=climbStairs(n-1)+climbStairs(n-2);
//         return dp[n];
//     }
// }

//SIMPLE RECURSION but TLE showing
//time limit exceeded  , o(2^N)

// class Solution {
//     public int climbStairs(int n) {
//      if(n==1) return 1;
//      if(n==2) return 2;
//      return climbStairs(n-1)+ climbStairs(n-2);
//     }
// }

//done