class Solution {
    public int largestAltitude(int[] gain) {
        int high=0;
        int ghigh=0;
        for(int i=0;i<gain.length;i++){
            ghigh+=gain[i];
            high=Math.max(high,ghigh);
        }
        return high;
    }
}
//done