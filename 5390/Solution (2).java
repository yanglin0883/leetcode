class Solution {
    public int minNumberOfFrogs(String c) {
        int n = c.length();
        if(n%5!=0 || c.charAt(0)!='c')return -1;
        StringBuilder sb = new StringBuilder(c);
        int frogs=0;
        while(sb.length()>0){
            frogs++;
            for(int i=0;i<sb.length();i++){
                if(sb.charAt(i)=='c'){
                    sb.deleteCharAt(i);
                    int j = sb.indexOf("r",i);
                    if(j==-1) return -1;
                    sb.deleteCharAt(j);
                    j = sb.indexOf("o",j);
                    if(j==-1) return -1;
                    sb.deleteCharAt(j);
                    j = sb.indexOf("a",j);
                    if(j==-1) return -1;
                    sb.deleteCharAt(j);
                    j = sb.indexOf("k",j);
                    if(j==-1) return -1;
                    sb.deleteCharAt(j);
                    i=j-1;
                }
            }
        }
        return frogs;
    }
}