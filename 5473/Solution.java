class Solution {
    public int minFlips(String target) {
        char[] str = target.toCharArray();
        boolean flag = true;
        int res=0;
        for(int i=0;i<str.length;i++){
            if((str[i]=='1')==flag){
                res++;
                flag = !flag;
            }
        }
        return res;
    }
}