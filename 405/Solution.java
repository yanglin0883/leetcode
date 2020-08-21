class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            int temp = num & 15;
            num>>>=4;
            //System.out.println();
            if(temp<10) sb.append(temp);
            else sb.append((char)(temp-10+'a'));
        }
        sb.reverse();
        return sb.toString();
    }
}