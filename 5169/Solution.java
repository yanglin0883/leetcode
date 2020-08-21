class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(toNum(date1)-toNum(date2));
    }
    int toNum(String s){
        String[] d = s.split("-");
        Integer[] a = new Integer[3];
        for(int i=0;i<3;i++)
            a[i] = new Integer(d[i]);
        int res = a[2];
        switch(a[1]){
                case 12:res+=30; case 11:res+=31; case 10:res+=30;
                case 9:res+=31; case 8:res+=31; case 7:res+=30;
             case 6:res+=31;case 5:res+=30; case 4:res+=31;
            case 3: res+= (a[0]%4==0)?29:28; if(a[0]==2100)res--;case 2:res+=31; 
        }
        // System.out.println(res);
        for(int i=1971;i<a[0];i++){
            if(i%4==0) res+=366;
            else res+=365;
        }
        return res;
    }
}