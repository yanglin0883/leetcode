class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null||s.length()==0) return 0;
        int counter=0;
        int i=s.length()-1;
        while(i>-1&&s.charAt(i)==' '){
            i--;
        }
        while(i>-1&&s.charAt(i)!=' '){
            i--;
            counter++;
        }
        return counter;
    }
}