class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=1;i<words.length;i++)
            if(compare(words[i], words[i-1], order)) return false;
        return true;
    }
    private boolean compare(String s1, String s2, String order){ // s2 be smaller,should get false
        int table[] = new int[26];
        for(int i=0;i<26;i++)
            table[order.charAt(i) - 'a'] = i;
        // for(int i=0;i<table.length;i++)
        //     System.out.print(table[i]+"  ");
        System.out.println();
        int i=0;
        while(true){
            if(i==s1.length()&&i==s2.length()) return false;
            else if(i==s1.length()) return true;
            else if(i==s2.length()) return false;
            if(table[s1.charAt(i)-'a'] < table[s2.charAt(i)-'a']) return true;
            else if(table[s1.charAt(i)-'a'] > table[s2.charAt(i)-'a']) return false;
            ++i;
        }
    }
}