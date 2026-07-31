// class Solution {
//     public List<Integer> getRow(int rowIndex) {
//         if(rowIndex==0){
//             List<Integer> row = new ArrayList<>();
//             row.add(1);
//             return row;
//         } 
//         List<List<Integer>> pascal = new ArrayList<>();
//         for (int i = 0; i <= rowIndex; i++) {
//             List<Integer> row = new ArrayList<>();
            
//             for (int j = 0; j <= i; j++) {
//                 if (j == 0 || j == i) {
//                     row.add(1);
//                 } else {
//                     int val = pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j);
//                     row.add(val);
//                 }
//             }
//             pascal.add(row);
//         }
        
//         return pascal.get(rowIndex);
//     }
// }

import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            row.add(1);
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        
        return row;
    }
}
