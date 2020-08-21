class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        boolean[] let = new boolean[26];
        for(char c:letters)
            let[c-'a'] = true;
        for(int i=target-'a'+1;i<52;i++){
            if(let[i%26]) return (char)(i%26+'a');
        }
        return target;
    }
}