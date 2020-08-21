class Solution {
    public boolean isAnagram(String s, String t) {
        int letter[] = new int[26];
        for(char a : s.toCharArray()){
            letter[a-'a']++;
        }
        for(char a : t.toCharArray()){
            letter[a-'a']--;
        }
        for(int i=0;i<26;i++)
            if(letter[i]!=0) return false;
        return true;
    }
}