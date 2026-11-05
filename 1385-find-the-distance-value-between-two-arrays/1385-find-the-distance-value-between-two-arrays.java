class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int m=arr1.length;
        int n=arr2.length;
        int count=0;
        
        for(int i=0;i<m;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                count++;
            }
        }
        return count;
    }
}

// class Solution {
//     public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
//         Arrays.sort(arr2);

//         int count = 0;
//         int n = arr2.length;

//         for (int i = 0; i < arr1.length; i++) {
//             int j = lowerBound(arr2, arr1[i]);

//             if (j == 0) { //all elements are greater or equal to arr1[i]
//                 if (arr2[0] - arr1[i] > d) count++;
//             } else if (j >= n) { //all elements are smaller than arr1[i]
//                 if (arr1[i] - arr2[n - 1] > d) count++;
//             } else {
//                 if (arr2[j] - arr1[i] > d && arr1[i] - arr2[j - 1] > d) count++;
//             }
//         }

//         return count;
//     }
//     private int lowerBound(int[] arr, int target) {
//         int low = 0, high = arr.length;

//         while (low < high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid;
//             }
//         }

//         return low;
//     }
// }