class Solution {
    public int countCharacters(String[] words, String chars) {
        //if(chars==null||chars.length()==0||words==null||words.length==0) return 0;
        int ch[] = new int[26];
        for(char c:chars.toCharArray())
            ch[c-'a']++;
        int count=0;
        T1:for(String s:words){
            int[] temp = Arrays.copyOf(ch,26);
            for(char c:s.toCharArray())
                temp[c-'a']--;
            for(int i=0;i<26;i++)
                if(temp[i]<0) continue T1;
            count+=s.length();
        }
        return count;
    }
}