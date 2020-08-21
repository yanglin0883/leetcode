class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> count = new HashMap();
        for(int i=0;i<words.length;i++){
            count.put(words[i], count.getOrDefault(words[i], 0)+1);
        }
        
        List<String> res = new ArrayList<String>(count.keySet());
        Collections.sort(res, (w1,w2)->count.get(w1).equals(count.get(w2))?
                         w1.compareTo(w2) : count.get(w2) - count.get(w1));
        
        return res.subList(0,k);
    }
}