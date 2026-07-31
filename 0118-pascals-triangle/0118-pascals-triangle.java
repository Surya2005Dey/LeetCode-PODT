class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int val = pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j);
                    row.add(val);
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}



// import java.util.*;

// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> pascal = new ArrayList<>();

//         for (int i = 0; i < numRows; i++) {
//             List<Integer> row = new ArrayList<>();
//             row.add(1);
//             for (int j = 1; j < i; j++) {
//                 int val = pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j);
//                 row.add(val);
//             }
//             if (i > 0) row.add(1); 
//             pascal.add(row);
//         }

//         return pascal;
//     }
// }
