class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(char c: word.toCharArray()){
            if(c>='A'&&c<='Z') count++;
        }
        if(count==1 && word.charAt(0)<='Z'&&word.charAt(0)>='A') return true;
        return count == word.length()||count==0;
    }
}