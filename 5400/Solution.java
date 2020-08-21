class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> map = new HashMap();
        for(List<String> i: paths){
            map.put(i.get(1), map.getOrDefault(i.get(1), 0)+1);
        }
        for(List<String> i: paths){
            if(map.containsKey(i.get(0)))
                map.put(i.get(0), map.get(i.get(0))-1);
        }
        for(String i:map.keySet()){
            if(map.get(i) == 1) return i;
        }
        return "";
    }
}