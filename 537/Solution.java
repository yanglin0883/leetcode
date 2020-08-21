class Solution {
    public String complexNumberMultiply(String a, String b) {
        int[] m = toNum(a);
        int[] n = toNum(b);
        System.out.println(m[0]+"  "+m[1]+" :: "+n[0]+"  "+n[1]);
        StringBuilder res = new StringBuilder();
        res.append(m[0]*n[0]-m[1]*n[1]);
        res.append('+');
        res.append(m[0]*n[1]+m[1]*n[0]);
        res.append('i');
        return res.toString();
    }
    private int[] toNum(String s){
        int[] res = new int[2];
        int num=0;
        int index=0;
        boolean negtive=false;
        if(s.charAt(0)=='-'){
            negtive=true;
            index++;
        }
        while(Character.isDigit(s.charAt(index))){
            num*=10;
            num+=(int)(s.charAt(index)-'0');            
            index++;
        }
        res[0]=num;
        if(negtive) res[0] = -res[0];
        index++;
        num=0;
        negtive=false;
        if(s.charAt(index)=='-'){
            negtive=true;
            index++;
        }
        while(Character.isDigit(s.charAt(index))){
            num*=10;
            num+=(int)(s.charAt(index)-'0');            
            index++;
        }
        res[1]=num;
        if(negtive) res[1] = -res[1];
        return res;
    }
}