class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack();
        for(int i=2*nums.length-1;i>=0;--i){
            int index = i%nums.length;
            while(!stack.empty()&&nums[stack.peek()]<=nums[index]){
                stack.pop();
            }
            res[index] = stack.empty()? -1:nums[stack.peek()];
            stack.push(index);
        }
        return res;
    }
}