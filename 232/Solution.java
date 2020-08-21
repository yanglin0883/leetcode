class MyQueue {

    Stack<Integer> entry = new Stack<Integer>();
    Stack<Integer> exit = new Stack<Integer>();
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        entry.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(exit.isEmpty()) entryToExit();
        return  exit.pop().intValue();
    }
    
    /** Get the front element. */
    public int peek() {
        if(exit.isEmpty()) entryToExit();
        return  exit.peek().intValue();
    }
    
    private void entryToExit(){
        while(!entry.isEmpty())
            exit.push(entry.pop());
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return entry.isEmpty()&&exit.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */