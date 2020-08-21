class Solution {
    public int countDigitOne(int n) {
        if(n<1) return 0;
        if(n<10) return 1;
        String num = new Integer(n).toString();
        int left = new Integer(num.substring(0,1));
        int bit = tens(num.length()-1);
        int rest = new Integer(num.substring(1,num.length()));
        int total=0;
        total += left>1 ? (bit ) : rest+1;
        // System.out.println(left+"  "+bit+" "+rest+" "+total);
        total += countDigitOne(rest)+ (left)*countDigitOne(bit-1);
        // System.out.println(left+"  "+bit+" "+rest+" "+total);
        return total;
    }
    int tens(int n){
        int product =1;
        for(int i=0;i<n;i++)
            product *= 10;
        return product;
    }
}