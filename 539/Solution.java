class Solution {
    public int findMinDifference(List<String> timePoints) {
        if(timePoints==null||timePoints.size()==0) return -1;
        int len = timePoints.size();
        int[] time = new int[len];
        int i=0;
        for(String temp: timePoints){
            time[i++] = toInt(temp);
        }
        Arrays.sort(time);
        int dif[] = new int[len];
        dif[0] = time[0]+1440-time[len-1];
        int min=dif[0];
        for(i=1;i<len;i++){
            dif[i]=time[i]-time[i-1];
            if(min>dif[i]) min = dif[i];
        }
        
        
        return min;
    }
    
    private int toInt(String s){
        int res=0;
        res+=(int)(s.charAt(0)-'0');
        res*=10;
        res+=(int)(s.charAt(1)-'0');
        res*=60;
        int temp=(int)(s.charAt(3)-'0');
        temp*=10;
        temp+=(int)(s.charAt(4)-'0');
        return res+temp;
    }
}