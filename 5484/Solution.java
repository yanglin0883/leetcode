class Solution {
    public char findKthBit(int n, int k) {
        if(k==1) return '0';
        StringBuilder sb = new StringBuilder("0");
        for(int i=2;i<=n;i++){
            char[] temp = new char[sb.length()];
            for(int ii=0;ii<sb.length();ii++){
                temp[temp.length-ii-1] = sb.charAt(ii)=='0'?'1':'0';
            }
            sb.append('1');
            sb.append(temp);
            // System.out.println(sb.toString());
        }
        return sb.charAt(k-1);
    }
}