class Solution {
    public int myAtoi(String str) {
        if(str == null&&str.length()<1) return 0;
        int len = str.length();
        long value=0;
        boolean signBit = true;
        boolean positive = true;
        for(int i=0;i<len;i++){
            char temp = str.charAt(i);
            if(signBit){
                if(temp == ' ') continue;
                if(temp =='+') {positive =true;signBit = false;continue;}
                if(temp == '-') {positive = false;signBit = false;continue;}
            }
            if(temp>='0'&&temp<='9'){
                signBit = false;
                value *= 10;
                value += (long)(temp - '0');
                if(value>2147483648l) break;
            }
            // System.out.println(value);
            if((temp<'0'||temp>'9')&&(temp!=' ')&&(temp!='-')&&(temp!='+')) break;
            if(!signBit&&((temp==' ')||(temp=='-')||(temp=='+'))) break;
        }
        if(!positive) value = - value;
        if(value>2147483647) return 2147483647;
        if(value<-2147483648) return  -2147483648;
        return (int)value;
    }
}