// class Solution {
//     public boolean isPalindrome(int x) {
//         String s= String.valueOf(x);
//         int n= s.length();
//         for(int i=0;i<n/2;i++){
//             if(s.charAt(i)!=s.charAt(n-1-i)) return false;
//         }
//         return true;
//     }
// }

// class Solution {
//     public boolean isPalindrome(int x) {
//         if (x < 0 || (x % 10 == 0 && x != 0)) {
//             return false;
//         }
//         int rev=0;
//         int temp=x;
//         while(temp>0){
//             int t=temp%10;
//             rev= rev*10+t;
//             temp/=10;
//         }
//         return (rev==x)?true:false;
//     }
// }


class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversedHalf = 0;
        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
