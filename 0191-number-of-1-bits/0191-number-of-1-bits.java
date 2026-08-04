// // Check the Last Bit (Using % 2)
// class Solution {
//     public int hammingWeight(int n) {
//         int count=0;
//         while(n>0){
//             if(n%2==1) count++;
//             n=n/2;
//         }
//         return count;
//     }
// }



// //Bit Manipulation (Right Shift)
// class Solution {
//     public int hammingWeight(int n) {
//         int count=0;
//         while(n!=0){
//             count+=n&1;
//             n=n>>>1;
//         }
//         return count;
//     }
// }


//Brian Kernighan's Algorithm ⭐ (Best)

class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}


// //Java Built-in Method
// class Solution {
//     public int hammingWeight(int n) {
//         return Integer.bitCount(n);
//     }
// }
