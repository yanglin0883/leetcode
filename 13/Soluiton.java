class Solution {
    public int romanToInt(String s) {
        if(s==null ||s.length()==0) return 0;
        int symbols[] = new int[s.length()];
        for(int i=0;i<s.length();i++){
            int temp=0;
            switch(s.charAt(i)){
                case 'I': temp = 1;break;
                case 'V': temp = 5;break;
                case 'X': temp = 10;break;
                case 'L': temp = 50;break;
                case 'C': temp = 100;break;
                case 'D': temp = 500;break;
                case 'M': temp = 1000;break;
                default: return 0;
            }
            symbols[i] = temp;
        }
        int val=0;
        for(int i=0;i<symbols.length;i++){
            if(isOne(symbols[i]) &&i<symbols.length-1&&symbols[i]<symbols[i+1]){
                val -= symbols[i];
                continue;
            }
            // else
                val+= symbols[i];
            // System.out.println(val);
        }
        return val;
    }
    private boolean isOne(int a){
        // System.out.println("judge!");
        if(a==1||a==10||a==100) return true;
        else return false;
    }
}