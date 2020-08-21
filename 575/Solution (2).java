class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<candies.length;i++){
            hs.add(candies[i]);
        }
        return Math.min(candies.length/2, hs.size());
    }
}