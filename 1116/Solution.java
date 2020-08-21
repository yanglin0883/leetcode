class ZeroEvenOdd {
    private int n;
    private boolean zero = false;
    private boolean  even = true;
    
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for(int i=0;i<n;i++){
            while(zero)Thread.sleep(1);
            printNumber.accept(0);
            zero = true;
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for(int i=2;i<=n;i+=2){
            while(!zero||even)Thread.sleep(1);
            printNumber.accept(i);
            zero = false;
            even = !even;
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for(int i=1;i<=n;i+=2){
            while(!zero||!even)Thread.sleep(1);
            printNumber.accept(i);
            zero = false;
            even = !even;
        }
    }
}