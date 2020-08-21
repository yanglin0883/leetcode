class Foo {

    private boolean s = false;
    private boolean t = false;
    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        s=true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(!s)Thread.sleep(1);
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        t=true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(!t) Thread.sleep(1);
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}