package races;

/**
 * Created by Администратор on 23.01.2017.
 */
public class ReadThread implements Runnable {
    private int []arr;
    public Thread t;

    ReadThread(int []arr) {
        this.arr = arr;
        t = new Thread(this, "ReadThread");
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ReadThread[" + i + "] " + arr[i]);
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//
//            }
        }
        System.out.println("\nПоток чтения завершил работу\n");
    }
}
