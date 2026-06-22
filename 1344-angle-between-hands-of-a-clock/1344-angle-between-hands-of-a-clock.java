// class Solution {
//     public double angleClock(int hour, int minutes) {
//         double md=minutes*6;
//         double min=minutes;
//         double hd= (hour%12)*30 + (min/12)*6;
//         double res=Math.abs(md-hd);
//         return res>180? 360-res: res;

//     }
// }

class Solution {
    public double angleClock(int hour, int minutes) {
        double min=minutes;
        double hd= (hour%12)*5 + (min/12);
        double res=Math.abs(min-hd)*6;
        return res>180? 360-res: res;

    }
}