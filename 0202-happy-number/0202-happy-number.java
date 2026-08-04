//LOOP--  4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4

class Solution {
    public boolean isHappy(int n) {
        while(n!=1){
            int num=0;
            while(n>0){
                int digit = n % 10;
                num += digit * digit;
                n/=10;
            }
            n=num;
            if(n==4) return false;
        }
        return true;
    }
}



// //HashSet Solution (Best for Beginners)

// class Solution {
//     public boolean isHappy(int n) {
//         HashSet<Integer> set= new HashSet<>();
//         while(n!=1){
//             if(set.contains(n)) return false;
//             set.add(n);
//             n=getNum(n);
//         }
//         return true;
//     }

//     public int getNum(int n){
//         int num=0;
//             while(n>0){
//                 num+= Math.pow(n%10,2);
//                 n/=10;
//             }
//         return num;
//     }
// }



// //Floyd Cycle Detection (Interview Best)
// class Solution {
//     public boolean isHappy(int n) {
//         int slow=n;
//         int fast=n;
//         do{
//             slow=getNum(slow);
//             fast=getNum(getNum(fast));
//         }while(slow!=fast);
          
//         return slow==1;
//     }
//     public int getNum(int n){
//         int num=0;
//             while(n>0){
//                 num+= Math.pow(n%10,2);
//                 n/=10;
//             }
//         return num;
//     }
// }