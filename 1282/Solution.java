class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, ArrayList<Integer>> map =  new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            if(map.containsKey(groupSizes[i])){
                map.get(groupSizes[i]).add(i);
            }
            else {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(i);
                map.put(groupSizes[i], temp);                
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for(Integer i: map.keySet()){
            int count=0;
            List<Integer> temp = new ArrayList<>();
            for(Integer j:map.get(i)){
                temp.add(j);
                count++;
                if(count==i){
                    res.add(temp);
                    count=0;
                    temp = new ArrayList<>();
                }
            }            
        }
        return res;
    }
}