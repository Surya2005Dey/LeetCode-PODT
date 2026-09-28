class Solution {
    public int maxDepth(String s) {
        int count=0;
        int temp=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                temp++;
                count=Math.max(count,temp);
            }
            if(c==')'){
                temp--;
            }
        }
        return count;
    }
}
//done