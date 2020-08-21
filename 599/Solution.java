class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(int i=0;i<list1.length;i++){
            if(!hm.containsKey(list1[i])) hm.put(list1[i], i);
        }
        int min= Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++){
            if(hm.containsKey(list2[i])){
                int sum=i+hm.get(list2[i]);
                if(sum<min) min=sum;
            }
        }
        List<String> res = new ArrayList<String>();
        for(int i=0;i<list2.length;i++){
            int index = min-i;
            if(index>-1&&index<list1.length&&list1[index].equals(list2[i]))
                res.add(list2[i]);
        }
        
        return res.toArray(new String[0]);
    }
}