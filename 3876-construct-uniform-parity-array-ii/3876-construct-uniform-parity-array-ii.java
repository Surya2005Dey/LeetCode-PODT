class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        for(int n :nums1){
            min=Math.min(min, n);
        }
        if(min%2==1) return true;

        boolean odd=false;
        boolean even=false;
        for(int num:nums1){
            if(num%2==0) even=true;
            else odd=true;

            if(odd==true && even==true) return false; 
        }

        return true;
    }
}

// class Solution {
//     public boolean uniformArray(int[] nums1) {
//         int minEl = Integer.MAX_VALUE;
//         for (int num : nums1) {
//             minEl = Math.min(minEl, num);
//         }

//         if (minEl % 2 == 1) {   // odd - then we can convert all even to odd
//             return true;        // all nums2 will be odd
//         }

//         // check if we can make all even in nums2
//         for (int num : nums1) {
//             if (num % 2 == 1) {
//                 return false;
//             }
//         }
//         return true;            // all nums2 will be even
//     }
// }

//done