class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0||t.length()==0) return "";
        int[] target = new int[128];
        for(char i:t.toCharArray())
            target[i]++;
        int[] res = {Integer.MAX_VALUE, 0,0};
        int left=0, right=0;
        int[] cur = new int[128];
        for(;right<s.length();right++){
            cur[s.charAt(right)]++;
            if(moreThan(cur, target)){
                while(left<s.length()&&moreThan(cur, target)){
                    cur[s.charAt(left)]--;
                    left++;
                }
                if(right-left+2<res[0]){
                    res[0] = right-left+2;
                    res[1] = left-1;
                    res[2] = right+1;
                }
            }
        }
        if(res[0]==Integer.MAX_VALUE) return "";
        else return s.substring(res[1], res[2]);
    }
    boolean moreThan(int[]a, int[]b){
        for(int i=0;i<128;++i){
            if(b[i]>a[i]) return false;
        }
        return true;
    }
}