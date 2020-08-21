class Solution {
    public int longestAwesome(String s) {
        boolean[][] sum = new boolean[s.length()+1][10];
        for(int i=0;i<s.length();i++){
            sum[i+1] = Arrays.copyOf(sum[i], 10);
            sum[i+1][s.charAt(i)-'0'] = !sum[i+1][s.charAt(i)-'0'];
        }
        int res=0;
        for(int i=0;i<sum.length;i++){
            for(int j=sum.length-1;j-i>=res ;j--){
                if(check(sum[i], sum[j])) res = Math.max(res, j-i);
            }
        }
        return res;
    }
    boolean check(boolean[] a, boolean[] b){
        int res=0;
        for(int i=0;i<10;i++){
            if(a[i]^b[i]) res++;
            if(res>1) return false;
        }
        return true;
    }
}