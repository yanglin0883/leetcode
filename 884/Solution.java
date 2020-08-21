class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(String str:A.split("\\s+"))
            hm.put(str, hm.getOrDefault(str, 0)+1);
        for(String str:B.split("\\s+"))
            hm.put(str, hm.getOrDefault(str, 0)+1);
        ArrayList<String> res = new ArrayList<>();
        for(String str: hm.keySet())
            if(hm.get(str) == 1) res.add(str);
        return res.toArray(new String[res.size()]);
    }
}