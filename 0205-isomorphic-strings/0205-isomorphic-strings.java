// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         HashMap<Character, Character> mapST= new HashMap<>();
//          HashMap<Character, Character> mapTS= new HashMap<>();

//         for(int i=0;i<s.length();i++){
//             char chS = s.charAt(i);
//             char chT = t.charAt(i);

//             if(mapST.containsKey(chS) && mapST.get(chS)!=chT){
//                 return false;
//             }else{
//                 mapST.put(chS,chT);
//             }

//             if(mapTS.containsKey(chT) && mapTS.get(chT)!=chS){
//                 return false;
//             }else{
//                 mapTS.put(chT,chS);
//             }
//         }
//         return true;
//     }
// }


class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] mapST= new int [128];
        int[] mapTS= new int[128];

        for(int i=0;i<s.length();i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if(mapST[chS]!=mapTS[chT]) return false;
            mapST[chS]=i+1;
            mapTS[chT]=i+1;
        }
        return true;
    }
}