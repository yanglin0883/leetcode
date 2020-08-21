class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int sum =0 ;
        for(int i=1971;i<year;i++){
            if(i%400==0||(i%4==0&&i%100!=0))sum+=366;
            else sum+=365;
        }
        int M[] ={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year%400==0||(year%4==0&&year%100!=0)) M[2] = 29;
        for(int i=1;i<month;i++)
            sum+=M[i];
        sum+=day;
        String[] week = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
        return week[sum%7];
    }
}