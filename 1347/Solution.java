class Solution {
    public int minSteps(String s, String t) {
        int[] letters = new int[26];
        for(char c: s.toCharArray()){
            letters[c-'a']++;
        }
        for(char c:t.toCharArray()){
            if(letters[c-'a']>0) letters[c-'a']--;
        }
        int sum=0;
        for(int i:letters){
            sum+=i;
        }
        return sum;
    }
}