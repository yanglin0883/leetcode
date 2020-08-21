class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<restaurants.length;i++){
            if(restaurants[i][2]>=veganFriendly &&restaurants[i][3]<=maxPrice&&restaurants[i][4]<=maxDistance)
                res.add(i);
        }
        Collections.sort(res, (p2, p1)->{
            if(restaurants[p1][1]==restaurants[p2][1]) return restaurants[p1][0]-restaurants[p2][0];
            return restaurants[p1][1]-restaurants[p2][1];
        });
        List<Integer> ret = new ArrayList<>();
        for(Integer i: res){
            ret.add(restaurants[i][0]);
        }
        return ret;
    }
}