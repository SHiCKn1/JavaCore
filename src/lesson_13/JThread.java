package lesson_13;

public class JThread extends Thread{
    public JThread(String name) {
        super(name);
    }

    public void run() {
        System.out.printf("%s started... \n",Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s fiished... \n",Thread.currentThread().getName());
    }
}
