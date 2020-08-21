class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Boolean> hm = new HashMap<>();
        for(String str:A.split(" "))
            if(hm.containsKey(str)) hm.put(str, false);
            else hm.put(str, true);
        for(String str:B.split(" "))
            if(hm.containsKey(str)) hm.put(str, false);
            else hm.put(str, true);
        ArrayList<String> res = new ArrayList<>();
        for(String str: hm.keySet())
            if(hm.get(str)) res.add(str);
        return res.toArray(new String[res.size()]);
    }
}