class Solution {
    public int maxDiff(int num) {
        String input = new Integer(num).toString();
        StringBuilder max = new StringBuilder(input);
        for(int i=0;i<max.length();i++){
            if(max.charAt(i)!='9'){
                char temp = max.charAt(i);
                change(max, temp, '9');
                break;
            }
        }
        StringBuilder min = new StringBuilder(input);
        char t = min.charAt(0);
        for(int i=0;i<min.length();i++){
            if(min.charAt(i)==t&&min.charAt(i)!='1'){
                char temp = min.charAt(i);
                change(min, temp, '1');
                break;
            }
            if(min.charAt(i)!=t && min.charAt(i)!='0'){
                char temp = min.charAt(i);
                change(min, temp, '0');
                break;
            }
        }
        return new Integer(max.toString()) - new Integer(min.toString());
    }
    void change(StringBuilder s, char a, char b){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == a) s.setCharAt(i, b);
        }
    }
}