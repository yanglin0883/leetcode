class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(beginWord==null||beginWord.length()==0) return 0;
        //if(beginWord.length()==1) return 1;
        if(wordList==null || wordList.size()==0) return 0;
        Queue<String> bfs=  new LinkedList<>();
        Set<String> visited = new HashSet<>();
        bfs.offer(beginWord);
        visited.add(beginWord);
        //wordList.add(endWord);
        int step=1;
        while(!bfs.isEmpty()){
            step++;
            int size = bfs.size();
            for(int i=0;i<size;i++){
                String temp = bfs.poll();
                for(String nei: getNeighbour(temp, wordList)){
                    if(nei.equals(endWord)) return step;
                    if(visited.contains(nei)) continue;
                    bfs.offer(nei);
                    visited.add(nei);
                }
            }
        }
        return 0;
    }
    ArrayList<String> getNeighbour(String ori, List<String>wordList){
        ArrayList<String> res = new ArrayList<>();
        char[] str = ori.toCharArray();
        for(int i=0;i<str.length;i++){
            char temp = str[i];
            for(char j='a';j<='z';j++){
                if(j==temp)continue;
                str[i] = j;
                String s = new String(str);
                if(wordList.contains(s)) res.add(s);
                
            }
            str[i] = temp;
        }
        return res;
    }
}