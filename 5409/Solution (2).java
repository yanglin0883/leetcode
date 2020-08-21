class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<Integer> res =  new HashSet();
        int a  ;
        for(int i=0;i+k<=s.length();i++){
            a= get(s.substring(i, i+k));
            res.add(a);
        }
        return res.size()==pow(2,k);
    }
    int get(String s){
        int res=0;
        for(int i=0;i<s.length();i++){
            res<<=1;
            res+= (int)(s.charAt(i)-'0');
        }
        return res;
    }
    int pow(int a, int b){
        int res = 1;
        for(int i=0;i<b;i++)
            res *= a;
        return res;
    }
}