class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i2=0, i1=0;
        while(i1<v1.length&&i2<v2.length){
            int c=com(v1[i1++], v2[i2++]);
            if(c!=0)return c;
        }
        while(i1<v1.length){
            int c=com(v1[i1++], "0");
            if(c!=0)return c;
        }
        while(i2<v2.length){
            int c=com("0", v2[i2++]);
            if(c!=0)return c;
        }
        return 0;
    }
    private int com(String a, String b){
        return new Integer(a).compareTo(new Integer(b));
    }
}