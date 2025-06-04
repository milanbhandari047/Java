    class MultithreadDemo  extends Thread{
    @Override
    public void run(){
        System.out.println("thread is in running state");

    }
    public static void main(String[] args) {
        MultithreadDemo t1 = new MultithreadDemo();
        t1.start(); // Start the thread
        System.out.println("Thread has been started");
    }
}