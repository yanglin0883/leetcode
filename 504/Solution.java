class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        boolean negative = false;
        if(num<0){
            num = -num;
            negative = true;
        }
        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.append(num%7);
            num/=7;
        }
        if(negative)sb.append('-');
        sb.reverse();
        return sb.toString();
    }
}