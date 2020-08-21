class Solution {
    public String intToRoman(int num) {
        int digits[] = new int[4];
        int i=0;
        while(num>0){
            digits[i++] = num%10;
            num /= 10;
        }
        StringBuilder rs = new StringBuilder();
        for(i=3;i>-1;i--){
            if(digits[i]==0)continue;
            rs.append(roman(i, digits[i]));
        }
        return rs.toString();
    }
    private String roman(int num, int digit){
        if(num==3){
            switch(digit){
                case 1: return "M";
                case 2: return "MM";
                case 3: return "MMM";
            }
        }
        if(num==2){
            switch(digit){
                case 1:return "C";
                case 2:return "CC";
                case 3:return "CCC";
                case 4:return "CD";
                case 5:return "D";
                case 6:return "DC";
                case 7:return "DCC";
                case 8:return "DCCC";
                case 9:return "CM";
            }
        }
        if(num==1){
            switch(digit){
                case 1:return "X";
                case 2:return "XX";
                case 3:return "XXX";
                case 4:return "XL";
                case 5:return "L";
                case 6:return "LX";
                case 7:return "LXX";
                case 8:return "LXXX";
                case 9:return "XC";
            }
        }
        if(num==0){
            switch(digit){
                case 1:return "I";
                case 2:return "II";
                case 3:return "III";
                case 4:return "IV";
                case 5:return "V";
                case 6:return "VI";
                case 7:return "VII";
                case 8:return "VIII";
                case 9:return "IX";
            }
        }
        return "";
    }
}