// class Solution {
//     public long countCommas(long n) {
//         long total = 0;
//        long lower=1000;
//        long comma=1;
//        while(lower<=n){
//         long upper=lower*1000-1;
//         if(upper>n) upper=n;
//         long countcomma=upper-lower+1;
//         total+=(countcomma*comma);
//         lower*=1000;
//         comma++;
//        }
//         return total;
//     }
// }

class Solution {
    public long countCommas(long n) {
       long total = 0;
       long start=1000;
       while(start<=n){
        long countcomma=n-start+1;
        total+=countcomma;
        start*=1000;
       }
        return total;
    }
}
//done