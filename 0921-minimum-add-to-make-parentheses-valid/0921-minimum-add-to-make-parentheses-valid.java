class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int total=0;
        for(char c:s.toCharArray()){
            if(c=='(') count++;
            else count--;
            if(count<0){
                total++;
                count=0;
            }
        }

        return Math.abs(count)+total;
    }
}
//done