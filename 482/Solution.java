class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder res = new StringBuilder();
        int count=0;
        for(int i=S.length()-1;i>-1;i--){
            char temp = S.charAt(i);
            if(temp=='-')continue;
            if(temp>='a'&&temp<='z') temp = (char)(temp+'A'-'a');
            res.append(temp);
            if(++count == K){
                count = 0;
                res.append('-');
            }
            //System.out.println(temp);
        }
        if(res.length()>0&&res.charAt(res.length()-1) == '-') res.deleteCharAt(res.length()-1);
        res.reverse();
        return res.toString();
    }
}