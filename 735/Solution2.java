class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        if(asteroids.length<2) return asteroids;
        Stack<Integer> stack = new Stack<Integer>();
        for(int a : asteroids){
            boolean flag = true;
            while(!stack.isEmpty()&&a<0&&stack.peek()>0){
                if(stack.peek()<-a){
                    stack.pop();
                }
                else if(stack.peek() == -a){
                    stack.pop();
                    flag = false;
                    break;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag) stack.push(a);
        }
        int[] res = new int[stack.size()];
        for(int i=res.length-1;i>-1;i--)
            res[i] = stack.pop();
        return res;
    }
}