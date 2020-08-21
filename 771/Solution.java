class Solution {
    public int numJewelsInStones(String J, String S) {
        int[] letters = new int['z' - 'A' + 1];
        for(int i=0;i<J.length();i++){
            letters[J.charAt(i)-'A'] ++;
        }
        int res=0;
        for(int i=0;i<S.length();i++){
            if(letters[S.charAt(i)-'A']>0)res++;
        }
        return res;
    }
}