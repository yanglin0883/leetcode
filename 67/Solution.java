class Solution {
    public String addBinary(String a, String b) {
        if(a==null||a.length()==0) return b;
        if(b==null||b.length()==0) return a;
        List<Character> res = new ArrayList<Character>();
        if(a.length()<b.length()){
            String temp = a;
            a=b;
            b=temp;
        }
        int ia=a.length()-1;
        int ib=b.length()-1;
        int carried =0;
        // System.out.println(res.toString());
        while(ia>-1&&ib>-1){
            // System.out.println(res.toString());
            char temp = (char)(a.charAt(ia--)-'0'+b.charAt(ib--)+carried);
            if(temp>'1'){
                temp-=(char)2;
                carried=1;
            }
            else 
                carried =0;
            res.add(temp);
        }
        while(ia>-1){
            char temp = (char)(a.charAt(ia--)+carried);
            if(temp>'1'){
                temp-=(char)2;
                carried=1;
            }
            else 
                carried =0;
            res.add(temp);
        }
        if(carried>0) res.add('1');
        StringBuilder sum = new StringBuilder();
        for(int i=res.size()-1;i>-1;i--){
            sum.append(res.get(i));
        }
        return sum.toString();
    }
}