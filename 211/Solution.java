class WordDictionary {

    class Trie{
        Trie(){}
        Trie(char c){
            val = c;
        }
        char val;
        Trie[] next = new Trie[26];
        boolean isEnd=false;
    }
    
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new Trie();
    }
    Trie root;
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        Trie temp =root;
        for(char c: word.toCharArray()){
            // System.out.println(c+" "+temp.val);
            // temp.isEnd = false;
            if(temp.next[c-'a']==null)temp.next[c-'a'] = new Trie(c);
            // not all situations should put a new node here
            temp = temp.next[c-'a'];
        }
        temp.isEnd = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return searchHelper(root, word);
    }
    private boolean searchHelper(Trie temp, String word){
//         if(word.equals("")){
            
//         }
        // System.out.println(temp.val +"  "+ word);
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            // System.out.println(c+" "+temp.val);
            // if(temp.isEnd) return false;
            if(c=='.'){
                for(Trie j: temp.next){
                    if(j==null)continue;
                    if(searchHelper(j, word.substring(i+1, word.length()))) return true;
                }
                return false;
            }
            if(temp.next[c-'a']==null) return false;
            temp = temp.next[c-'a'];
        }
        return temp.isEnd;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */