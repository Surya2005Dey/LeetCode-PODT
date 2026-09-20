class Solution {
    public int reverseDegree(String s) {
        int res=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            res+=(('a'-c)+26)*(i+1);
        }
        return res;
    }
}
//done