class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String max = "";
        for(int i=0;i<words.length;i++){
            if(canBuild(words[i], words) && words[i].length()>max.length()) max = words[i];
        }
        return max;
    }
    boolean canBuild(String s, String[] words){
        for(int i=1;i<=s.length();i++){
            if(!contains(words, s.substring(0,i))) return false;
        }
        return true;
    }
    boolean contains(String[] words, String target){
        for(String s:words){
            if(s.equals(target))return true;
        }
        return false;
    }
}