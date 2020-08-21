class Solution {
    public double angleClock(int hour, int minutes) {
        double d1 = 6 * minutes;
        double d2 = ((hour==12)?0:hour)*30 + 0.5*minutes;
        double d = Math.abs(d1-d2);
        return (d>180)?360-d:d;
    }
}