class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map =  new HashMap();
        for(String temp:strs){
            String key = getKey(temp);
            if(map.containsKey(key)){
                map.get(key).add(temp);
            }
            else{
                map.put(key, new ArrayList<String>());
                map.get(key).add(temp);
            }
        }
        List<List<String>> res = new ArrayList();
        for(String i: map.keySet()){
            res.add(map.get(i));
        }
        return res;
    }
    String getKey(String temp){
        char[] c=temp.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}