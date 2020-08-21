/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */
class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int x=1, y=1000;
        for(x=1;x<10001;x++){
            for( y=1;y<10001&&customfunction.f(x,y)<z;y++);
            if(customfunction.f(x,y)==z) res.add(Arrays.asList(x,y));
        }
        return res;
    }
}