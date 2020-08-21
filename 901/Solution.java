class StockSpanner {

    public StockSpanner() {
        stack = new Stack();
        stack.push(new int[]{0, Integer.MAX_VALUE});
    }
    Stack<int[]> stack;
    int index=0;
    public int next(int price) {
        index++;
        while(stack.peek()[1]<=price)stack.pop();
        int ret = index - stack.peek()[0];
        stack.push(new int[]{index, price});
        return ret;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */