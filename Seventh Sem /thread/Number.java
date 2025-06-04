class Number extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Second extends Thread {
    public void run() {
        for (int i = 11; i < 20; i++) {
            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class ThreadInterval {
    public static void main(String[] args) {
        Thread Number = new Number();
        Thread Second = new Second();
        Number.start();
        Second.start();
    }
}