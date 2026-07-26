// class Solution {
//     public int mySqrt(int x) {
//         if(x==0||x==1) return x;
//         long num=x;
//         for(long i=1;i<=x/2;i++){
//             if(i*i<=num && (i+1)*(i+1)>num) return (int)i;
//         }
//         return 1;
//     }
// }

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1, right = x / 2, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid;  
            
            if (sq == x) return mid;
            if (sq < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
