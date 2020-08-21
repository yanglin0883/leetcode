class Solution {
    public int distinctEchoSubstrings(String text) {
        Set<String> res = new HashSet<>();
        char[] str = text.toCharArray();
        for(int i=0;i<str.length;i++){
            T2:for(int j=1;i+j*2<=str.length;j++){
                for(int k=i;k<i+j;k++){
                    if(str[k]!=str[k+j])continue T2;
                }
                //System.out.println(i+"  "+ j);
                res.add(new String(str, i, j*2));
            }
        }
        return res.size();
    }
}