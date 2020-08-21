class Solution {
    public int maxScore(String s) {
        int leftZ=0, leftO=0, rightZ=0, rightO=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')rightZ++;
            else rightO++;
        }
        int max = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){rightZ--;leftZ++;}
            else {rightO--;leftO++;}
            max = Math.max(max, rightO+leftZ);
        }
        return max;
    }
}