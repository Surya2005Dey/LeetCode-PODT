
// class Solution {
//     public int numDistinct(String s, String t) {
//         return solve(s,t,0,0);
//     }

//     public int solve(String s, String t,int i,int j ){
//         if(j==t.length()) return 1;
//         if(i==s.length()) return 0;

//         if(s.charAt(i)==t.charAt(j)){
//             return solve(s,t,i+1,j+1) + solve(s,t,i+1,j);
//         }else{
//             return solve(s,t,i+1,j);
//         }
//     }
// }

// class Solution {
//     int[][] dp = new int[1001][1001];
//     int solve(String s, String t, int m, int n) {
//         if(n == 0)
//             return dp[m][n] = 1;
//         if(m == 0)
//             return dp[m][n] = 0;
        
//         if(dp[m][n] != -1)
//             return dp[m][n];
        
//         if(s.charAt(m-1) == t.charAt(n-1))
//             return dp[m][n] = solve(s, t, m-1, n) + solve(s, t, m-1, n-1);
//         else
//             return dp[m][n] = solve(s, t, m-1, n);
//     }
//     public int numDistinct(String s, String t) {
//         int m = s.length();
//         int n = t.length();
//         if(m < n)
//             return 0;
//         for(int[] row : dp)
//             Arrays.fill(row, -1);
//         return solve(s, t, m, n);
//     }
// }
 


//  class Solution {
//     public int numDistinct(String s, String t) {
//         int m=s.length();
//         int n=t.length();
//         long[][] dp = new long[m+1][n+1];

//         for(int i=0;i<=m;i++){
//             dp[i][0]=1;
//         }
//         for(int j=1;j<=n;j++){
//             dp[0][j]=0;
//         }

//         for(int i=1;i<=m;i++){
//             for(int j=1;j<=n;j++){
//                 if(s.charAt(i-1) == t.charAt(j-1)){
//                     dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
//                 }else{
//                     dp[i][j]=dp[i-1][j];
//                 }
//             }
//         }
//         return (int) dp[m][n];

//     }
// }

class Solution {
    public int numDistinct(String s, String t) {
        int m=s.length();
        int n=t.length();
        long[] curr = new long[n+1];
        long[] prev = new long[n+1];

        prev[0]=curr[0]=1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    curr[j]=prev[j-1]+prev[j];
                }else{
                    curr[j]=prev[j];
                }
            }
            prev=curr.clone();
        }
        return (int) curr[n];

    }
}