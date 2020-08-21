class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        for(int i=0;i<=num;i++){
            List<String> hours = getHour(i);
            List<String> minutes = getMinute(num-i);
            for(String h:hours){
                for(String m:minutes){
                    res.add(h+":"+m);
                }
            }
        }
        return res;
    }
    List<String> getHour(int n){
        List<String> res = new ArrayList<>();
        if(n>3||n<0) return res;
        if(n==0) {
            res.add("0");
            return res;
        }
        else if(n==3){
            res.add("7");
            res.add("11");
            return res;
        }
        else if(n==1){
            res.add("1");
            res.add("2");
            res.add("4");
            res.add("8");
            return res;
        }
        else {
            res.add("3");
            res.add("5");
            res.add("6");
            res.add("9");
            res.add("10");
            return res;
        }
    }
    List<String> getMinute(int n){
        List<String> res = new ArrayList<>();
        for(int i=0;i<60;i++){
            if(Integer.bitCount(i)==n){
                if(i<10) res.add("0"+Integer.toString(i));
                else res.add(Integer.toString(i));
            }
        }
        return res;
    }
}