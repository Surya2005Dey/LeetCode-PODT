// class Solution {
//     public String digitSum(String s, int k) {
//         String ans="";
//         while(s.length()>k){
//             StringBuilder t = new StringBuilder();
//             for(int i=0;i<s.length();i=i+k){
//                 int sum= sums(i,Math.min(i+k,s.length()),s);
//                 t.append(sum);
//             }
//             s=t.toString();
//         }
//         return s;
//     }
//     public int sums(int i,int j, String s){
//         int t=0;
//         for(int k=i;k<j;k++){
//             t += s.charAt(k) - '0';
//         }
//         return t;
//     }
// }


class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;

                for (int j = i; j < Math.min(i + k, s.length()); j++) {
                    sum += s.charAt(j) - '0';
                }

                sb.append(sum);
            }

            s = sb.toString();
        }

        return s;
    }
}