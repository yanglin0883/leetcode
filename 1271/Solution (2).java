class Solution {
    public String toHexspeak(String num) {
        StringBuilder temp = new StringBuilder(Long.toHexString(new Long(num)));
        System.out.println(temp.toString());
        for(int i=0;i<temp.length();i++){
            if(temp.charAt(i)=='0')temp.setCharAt(i, 'O');
            if(temp.charAt(i)=='1')temp.setCharAt(i, 'I');
            if(temp.charAt(i)>='a') temp.setCharAt(i, (char)(temp.charAt(i)-'a'+'A'));
            if(!Character.isLetter(temp.charAt(i))) return "ERROR";
        }        
        return temp.toString();
    }
    char[]digit={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

}