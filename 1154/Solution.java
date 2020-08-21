class Solution {
    public int dayOfYear(String date) {
        Integer year = new Integer(date.substring(0,4));
        Integer month = new Integer(date.substring(5,7));
        Integer day = new Integer(date.substring(8,10));
        int sum=0;
        int[] M = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if((year%400==0)||(year%4==0 && year%100!=0)) M[1] = 29;
        for(int i=0;i<month-1;i++)
            sum+=M[i];
        sum = sum+day;
        return sum;
    }
}