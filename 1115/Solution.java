class FooBar {
    private int n;
    private boolean coin = false;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(coin) Thread.sleep(1);
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            coin = !coin;
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(!coin) Thread.sleep(1);
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            coin = !coin;
        }
    }
}