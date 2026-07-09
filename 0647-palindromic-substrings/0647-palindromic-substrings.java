class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){
            if(findp(s,i,j)) count++;
            }
        }
        return count;
    }
   public boolean findp(String s, int i,int j){
        while(j>=i){
                if(s.charAt(i)!=s.charAt(j)){
                   return false; 
                }
                i++;
                j--;
            }
            return true;
    }
}