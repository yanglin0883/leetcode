class Solution {
    public String reformatDate(String date) {
        String[] d = date.split(" ");
        StringBuilder res = new StringBuilder();
        res.append(d[2]);
        res.append('-');
        String[] mon = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for(int i=0;i<12;i++){
            if(d[1].equals(mon[i])){
                if(i+1<10)res.append('0');
                res.append(i+1);
                break;
            }
        }
        res.append('-');
        if(d[0].length()==3){
            res.append('0');
            res.append(d[0].charAt(0));
        }else{
            res.append(d[0].charAt(0));
            res.append(d[0].charAt(1));
        }
        return res.toString();
    }
}