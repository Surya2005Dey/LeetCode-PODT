class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int sum=Integer.MAX_VALUE;
        int n= nums.size();
        int[] pSum= new int[n+1];
        for(int i=0;i<n;i++){
            pSum[i+1]=pSum[i]+nums.get(i);
        }
        for(int i=l;i<=r;i++){
            for(int j=0;j<=n-i;j++){
                int curr=pSum[j+i]-pSum[j];
                if(curr==1) return 1;
                if(curr>0){
                    sum=Math.min(sum,curr);
                }
            }
        }
        return sum!=Integer.MAX_VALUE?sum:-1;
    }
}

// class Solution {
//     public int minimumSumSubarray(List<Integer> nums, int l, int r) {
//         int n = nums.size();
//         int ans = Integer.MAX_VALUE;

//         for (int i = 0; i < n; i++) {
//             int sum = 0;

//             for (int j = i; j < n && j - i + 1 <= r; j++) {
//                 sum += nums.get(j);

//                 int len = j - i + 1;
//                 if (len >= l && sum > 0) {
//                     ans = Math.min(ans, sum);
//                 }
//             }
//         }

//         return ans == Integer.MAX_VALUE ? -1 : ans;
//     }
// }