class Trie {
    class Node{
        Node(){}
        Node(int v){
            val = v;
        }
        int val;
        Node[] next=new Node[26];
        boolean containsKey(char ch){
            return next[ch-'a'] !=null;
        }
        Node get(char ch){
            return next[ch-'a'];
        }
        void put(char ch, Node node){
            next[ch-'a'] =node;
        }
        void setEnd(){
            val++;
        }
        boolean isEnd(){
            return val>0;
        }
    }

    /** Initialize your data structure here. */
    public Trie() {
        root = new Node(0);
    }
    Node root;
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node cur = root;
        for(char c:word.toCharArray()){
            if(!cur.containsKey(c)){
                cur.put(c, new Node());
            }
            cur = cur.get(c);
        }
        cur.setEnd();
    }
    
    /** Returns if the word is in the trie. */
    Node searchPrefix(String word){
        Node cur = root;
        for(char c : word.toCharArray()){
            if(cur.containsKey(c))
                cur = cur.get(c);
            else return null;
        }
        return cur;
    }
    public boolean search(String word) {
        Node node = searchPrefix(word);
        return node!=null && node.isEnd();
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node node =searchPrefix(prefix);
        return node!=null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */