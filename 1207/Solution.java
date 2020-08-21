class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        if(arr.length<2) return true;
        HashMap<Integer,Integer> hm = new HashMap();
        for(int i:arr){
            if(hm.containsKey(i))
                hm.put(i,hm.get(i)+1);
            else
                hm.put(i,1);
        }
        ArrayList<Integer> al = new ArrayList();
        for(Integer i: hm.keySet()){
            Integer temp = hm.get(i);
            if(al.contains(temp))
                return false;
            else
                al.add(temp);
        }
        return true;
    }
}