class Solution {
    public int firstUniqChar(String s) {
        int letter[] = new int[26];
        for(char a:s.toCharArray()){
            letter[a - 'a']++;
        }
        for(int i=0;i<s.length();i++)
            if(letter[s.charAt(i) - 'a']==1) return i;
        return -1;
    }
}