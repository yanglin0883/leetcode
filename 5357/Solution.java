class CustomStack {
    ArrayList<Integer> stack = new ArrayList();
    int max;
    public CustomStack(int maxSize) {
        max = maxSize;
    }
    
    public void push(int x) {
        if(stack.size()<max) stack.add(x);
    }
    
    public int pop() {
        if(stack.size()==0) return -1;
        return stack.remove(stack.size()-1);
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<k&&i<stack.size();i++){
            stack.set(i, stack.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */