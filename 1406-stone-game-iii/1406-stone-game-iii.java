// // Approach 1: Recursion + Memoization--Time: O(n), Space: O(n)
// class Solution {
//     int n;
//     Integer[] dp;
//     public String stoneGameIII(int[] stoneValue) {
//         n=stoneValue.length;
//         dp=new Integer[n];
//         int diff=solve(stoneValue, 0);

//         if(diff>0) return "Alice";
//         else if(diff<0) return "Bob";

//         return "Tie";
//     }

//     public int solve(int[] stoneValue, int i){
//         if(i==n) return 0;

//         if(dp[i]!=null) return dp[i];
//         int ans= stoneValue[i]-solve(stoneValue,i+1);
//         if(i+1<n)
//             ans=Math.max(ans,stoneValue[i]+stoneValue[i+1]-solve(stoneValue,i+2));
        
//         if(i+2<n)
//             ans=Math.max(ans,stoneValue[i]+stoneValue[i+1]+stoneValue[i+2]-solve(stoneValue,i+3));

//         return dp[i]=ans;
//     }
// }

// Approach 2: Bottom-Up DP----Time: O(n), Space: O(N)
// class Solution {
//     public String stoneGameIII(int[] stoneValue) {
//         int n=stoneValue.length;
//         int[] dp= new int[n+1];
        
//         for(int i=n-1;i>=0;i--){

//             dp[i]= stoneValue[i]-dp[i+1];
            
//             if(i+2<=n)
//                 dp[i]=Math.max(dp[i],stoneValue[i]+stoneValue[i+1]-dp[i+2]);
        
//             if(i+3<=n)
//                 dp[i]=Math.max(dp[i],stoneValue[i]+stoneValue[i+1]+stoneValue[i+2]-dp[i+3]);
//         }

//         int diff=dp[0];
//         if(diff>0) return "Alice";
//         else if(diff<0) return "Bob";

//         return "Tie";
//     }
// }


//Approach 3: Constant Space DP---Time: O(n), Space: O(1)
class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
            int a=0;     //a = dp[i+1]
            int b=0;     //b = dp[i+2]
            int c=0;     //c = dp[i+3]

        for(int i=n-1;i>=0;i--){
  
            int result = Integer.MIN_VALUE;

            result= Math.max(result,stoneValue[i]-a);
            
            if(i+2<=n)
                result=Math.max(result,stoneValue[i]+stoneValue[i+1]-b);
        
            if(i+3<=n)
                result=Math.max(result,stoneValue[i]+stoneValue[i+1]+stoneValue[i+2]-c);

                c=b;
                b=a;
                a=result;
        }

        int diff=a;
        if(diff>0) return "Alice";
        else if(diff<0) return "Bob";

        return "Tie";
    }
}
