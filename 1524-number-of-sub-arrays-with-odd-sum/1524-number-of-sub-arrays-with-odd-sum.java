// class Solution {
//     public int numOfSubarrays(int[] arr) {
//         int count=0;
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum+=arr[j];
//                 if(sum%2!=0) count++;
//                 count%=1000000007;
//             }
//         }
//         return count;
//     }
// }

// class Solution {
//     public int numOfSubarrays(int[] arr) {
//         int M=(int)1e9+7;
//         int count=0;
//         int n=arr.length;
//         int[] prefix= new int[n];
//         prefix[0]=arr[0];
//         for(int i=1;i<n;i++){
//             prefix[i]=prefix[i-1]+arr[i];
//         }
//         int even=1;
//         int odd=0;
//         for(int i=0;i<n;i++){
//             if(prefix[i]%2==0){
//                 count=(count+odd)%M;
//                 even++;
//             }else{
//                 count=(count+even)%M;
//                 odd++;
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int numOfSubarrays(int[] arr) {
        int M=(int)1e9+7;
        int count=0;
        int n=arr.length;
        int sum=0;
        int even=1;
        int odd=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum%2==0){ // odd + even = odd
                count=(count+odd)%M;
                even++;
            }else{ // even + odd = odd
                count=(count+even)%M;
                odd++;
            }
        }
        return count;
    }
}