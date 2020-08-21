class Solution {
    public String addStrings(String num1, String num2) {
        if(num1==null||num1.length()==0) return num2;
        if(num2==null||num2.length()==0) return num1;
        int ia=num1.length()-1;
        int ib=num2.length()-1;
        StringBuilder res = new StringBuilder();
        int carried=0;
        while(ia>-1&&ib>-1){
            int temp = num1.charAt(ia--)-'0'+num2.charAt(ib--)-'0'+carried;
            if(temp>9){
                carried=1;
                temp-=10;
            }
            else
                carried=0;
            res.append(temp);
        }
        //System.out.println(res.toString());
        while(ib>-1){
            int temp = num2.charAt(ib--)-'0'+carried;
            if(temp>9){
                carried=1;
                temp-=10;
            }
            else
                carried=0;
            res.append(temp);
        }
        while(ia>-1){
            int temp = num1.charAt(ia--)-'0'+carried;
            if(temp>9){
                carried=1;
                temp-=10;
            }
            else
                carried=0;
            res.append(temp);
        }
        if(carried==1) res.append('1');
        res.reverse();
        return res.toString();
    }
}