//BROUTE FORCE
// class Solution {
//     public int maxLength(int[] nums) {
//         int len =0;
//         int n=nums.length;
//             for(int i=0;i<n;i++){
//                 for(int j=0;j<n;j++){
//                     if(product(nums,i,j)==(lcmArray(nums,i,j)*gcdArray(nums,i,j))){
//                         len=Math.max(len,j-i+1);
//                     }
//                     if(product(nums,i,j)>2520) break;
//                 }
//             }
//             return len;
//     }
//     static int product(int[] arr, int i,int j){
//          int result =1;
//         for (int k = i; k <=j; k++) {
//             result *=arr[k];
//         }

//         return result;
//     }
//     static int gcd(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
//     static int gcdArray(int[] arr, int i, int j) {
//         int result = arr[i];
//         for (int k = i; k <=j; k++) {
//             result = gcd(result, arr[k]);
//         }

//         return result;
//     }

//     static long lcm(long a, long b) {
//         return (a / gcd((int)a, (int)b)) * b;
//     }
//     static long lcmArray(int[] arr,int i, int j) {
//         long result = arr[i];

//         for (int k = i; k <= j; k++) {
//             result = lcm(result, arr[k]);
//         }

//         return result;
//     }
// }

//OPTIMAL = on [1,2,3,4,5,6,7,8,9,10] array, max lcm is 2520 and min gcd is 1 ,max gcd is 10 ,max lcm and max gcd  cannot both at a time,because  if max lcm  has one array the this array will be the min gcd which is 1  wii be present  beacuse prime numbers has 1 gcd.
class Solution {

    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            long prod = 1;
            long lcm = 1;
            int gcd = 0;

            for (int j = i; j < n; j++) {

                prod *= nums[j];
                if(prod>2520) break; //because mac lcm* gcd is 2520 
                if (gcd == 0) {
                    gcd = nums[j];
                } else {
                    gcd = gcd(gcd, nums[j]);
                }
                lcm = lcm(lcm, nums[j]);

                if (prod == lcm * gcd) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private long lcm(long a, long b) {
        return (a / gcd((int) a, (int) b)) * b;
    }
}