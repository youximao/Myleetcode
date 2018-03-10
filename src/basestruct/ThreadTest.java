package basestruct;

class MyThre implements Runnable{

    @Override
    public void run() {
        Thread.currentThread().interrupt();
        try {
            Thread.sleep(100);


            Thread.interrupted();
            System.out.println(Thread.currentThread().isInterrupted());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ThreadTest {

}
