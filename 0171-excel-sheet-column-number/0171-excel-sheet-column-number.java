// class Solution {
//     public int titleToNumber(String columnTitle) {
//         int n=columnTitle.length();
//         int res=0;
//         int pow=0;
//         for(int i=n-1;i>=0;i--){
//            int val = (int)(Math.pow(26, pow) * (columnTitle.charAt(i) - 'A' + 1));
//             res+=val;
//             pow++;
//         }
//         return res;
//     }
// }

//best

class Solution {
    public int titleToNumber(String columnTitle) {
        int n=columnTitle.length();
        int res=0;
        for(int i=0;i<n;i++){
            res= res*26+ columnTitle.charAt(i) - 'A' + 1;
        }
        return res;
    }
}


// class Solution {
//     public int titleToNumber(String columnTitle) {
//         int n = columnTitle.length();
//         int ans = 0;
//         for (int i = 0; i < n; i++) {
//             int value = columnTitle.charAt(i) - 'A' + 1;
//             int power = n - i - 1;
//             ans += value * (int)Math.pow(26, power);
//         }
//         return ans;
//     }
// }

// all is same time and space  complexity- Time-O(N), space-O(1)

//done