class Solution {
    public String rankTeams(String[] votes) {
        if(votes.length==1)return votes[0];
        Map<Character, List<Integer>> map = new HashMap();
        for(String str:votes){
            for(int i=0;i<str.length();i++){
                if(!map.containsKey(str.charAt(i))) map.put(str.charAt(i), new ArrayList());
                map.get(str.charAt(i)).add(i);
            }
        }
        ArrayList<Map.Entry<Character, List<Integer>>> res = new ArrayList();
        for(Map.Entry<Character, List<Integer>> c: map.entrySet()){
            Collections.sort(c.getValue());
            res.add(c);
        }
        Collections.sort(res, (p1,p2)->{
            for(int i=0;i<p1.getValue().size();i++){
                if(p1.getValue().get(i)<p2.getValue().get(i)) return -1;
                if(p1.getValue().get(i)>p2.getValue().get(i)) return 1;
            }
            return p1.getKey().compareTo(p2.getKey());
        });
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, List<Integer>> c: res)
            sb.append(c.getKey());
        return sb.toString();
    }
}