class Solution {
    public int distributeCandies(int[] candies) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<candies.length;i++)
            hm.put(candies[i], hm.getOrDefault(candies[i], 0)+1);
        int total=0, one=0, comp=0;
        for(Integer i: hm.keySet()){
            if(hm.get(i)==1) one++;
            else if(hm.get(i) == 2) total++;
            else if(hm.get(i)>2) {
                comp = comp + hm.get(i) -2;
                total++;
            }
        }
        if(comp>=one) total+=one;
        else total+=comp + (one - comp)/2;
        return total;
    }
}