class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<=2) return n;
        if(n==3) return n+1;
        int bits = Integer.SIZE - Integer.numberOfLeadingZeros(n);
        int maxValue = (1 << bits) - 1;
        return maxValue+1;
    }
}

// class Solution {
//     public int uniqueXorTriplets(int[] nums) {
//         int n = nums.length;

//         if (n <= 2) return n;   
//         if (n == 3) return n + 1; 
        
//         int bits = bitLength(n);
//         int maxXor = (1 << bits) - 1;
//         return maxXor + 1;
//     }
//     private int bitLength(int n) {
//         int bits = 0;
//         while (n > 0) {
//             bits++;
//             n >>= 1;
//         }
//         return bits;
//     }
// }
//done
