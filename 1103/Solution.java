class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int count =1, i =0;
        while(candies>count){
            candies -= count;
            res[i++] += count++;
            if(i>=num_people) i=0;
        }
        res[i] += candies;
        return res;
    }
}