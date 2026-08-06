class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        for(int i=1;i<=n/2;i++){
            if(Math.pow(2,i)==n) return true;
            if(Math.pow(2,i)>n) break;
        }
        return false;
    }
}

// class Solution {
//     public boolean isPowerOfTwo(int n) {
        
//         return n > 0 && (n&(n-1))==0;
//     }
// }

// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if(n<=0) return false;
//         while(n>1){
//             if(n%2!=0) return false;
//             n=n/2;
//         }
//         return true;
//     }
// }