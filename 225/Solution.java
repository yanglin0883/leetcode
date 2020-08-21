class MyStack {
    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();
    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue1.offer(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        Integer x = queue1.poll();
        while(!queue1.isEmpty()){
            queue2.offer(x);
            x= queue1.poll();
        }
        queue1 = queue2;
        queue2 = new LinkedList<>();
        return x.intValue();
    }
    
    /** Get the top element. */
    public int top() {
        Integer x = queue1.poll();
        while(!queue1.isEmpty()){
            queue2.offer(x);
            x= queue1.poll();
        }
        queue2.offer(x);
        queue1 = queue2;
        queue2 = new LinkedList<>();
        return x.intValue();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */