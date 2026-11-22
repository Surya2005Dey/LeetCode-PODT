// class Solution {
//     public boolean checkString(String s) {
//         boolean appearA=false;
//         boolean appearB= false;
//         for(char c: s.toCharArray()){
//             if(appearB==true && c =='a') return false;
//             if(c=='a'){
//                 appearA=true;
//             }else{
//                 appearB=true;
//             }
//         }
//         return true;
//     }
// }

class Solution {
    public boolean checkString(String s) {
        boolean appearB= false;
        for(char c: s.toCharArray()){
            if(c=='b'){
                appearB=true;
            }else if(appearB){
                return false;
            }
        }
        return true;
    }
}