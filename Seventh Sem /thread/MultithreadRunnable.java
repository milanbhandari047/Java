

class MultithreadRunnable implements Runnable{
    @Override
    public  void run(){
        System.out.println("Thread is in running state");
    }
    public static void main(String[] args) {
        MultithreadRunnable runnable = new MultithreadRunnable();
        Thread thread = new Thread(runnable);
        thread.start(); // Start the thread
        System.out.println("Thread has been started");
    }
}