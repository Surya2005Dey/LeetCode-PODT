// class Solution {
//     public boolean canAliceWin(int n) {
//         int bobTurn=0;
//         int aliceTurn=1;
//         int c=10;
//         while(n>=c){
//             if(aliceTurn==1 && n>=c){
//                 n-=c;
//                 c--;
//                 aliceTurn=0;
//                 bobTurn=1;
//             }
//             if(bobTurn==1 && n>=c){
//                 n-=c;
//                 c--;
//                 aliceTurn=1;
//                 bobTurn=0;
//             }
//         }
//         if(aliceTurn==1) return false;
//         return true;
//     }
// }

class Solution {
    public boolean canAliceWin(int n) {
        boolean aliceTurn=true;
        int c=10;
        while(n>=c){
           n-=c;
           c--;
           aliceTurn=!aliceTurn;
        }
        
        return !aliceTurn;
    }
}
//Done