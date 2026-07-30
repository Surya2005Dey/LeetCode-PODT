class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int i=1;
        int count=0;
        while(n>8){
                count+=i*8;
                i++;
                n-=8;
        }
        return count+(n*i);
    }
}




// class Solution {
//     public int minimumPushes(String word) {
//         int n=word.length();
//        int res=0;
//        for(int i=0;i<n;i++){
//         res+=(i/8+1);
//        }
//        return res;
//     }
// }



// class Solution {
//     public int minimumPushes(String word) {
//         int n=word.length();
//         int i=1;
//         int count=0;
//         while(n>0){
//             if(n>8){
//                 count+=i*8;
//                 i++;
//                 n-=8;
//             }else{
//                 count+=i*n;
//                 n=0;
//                 i++;
//             }
//         }

//         return count;
//     }
// }