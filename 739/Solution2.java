class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=T.length-1;i>-1;i--){
            while(!stack.isEmpty() && T[i]>=T[stack.peek()]) stack.pop();
            ans[i] = stack.isEmpty() ? 0 : stack.peek()-i;
            stack.push(i);
        }
        return ans;
    }
}