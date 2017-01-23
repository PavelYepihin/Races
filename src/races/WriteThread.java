package races;

import java.util.Random;

/**
 * Created by Администратор on 23.01.2017.
 */
public class WriteThread implements Runnable{
    private int []arr;
    public Thread t;

    WriteThread(int []arr) {
        this.arr = arr;
        t = new Thread(this, "WriteThread");
        t.start();
    }

    @Override
    public void run() {
        Random rnd = new Random();
        int i = 0;
        do {
            System.out.println("WriteThread[" + i + "] " + (arr[i] = 128 + rnd.nextInt(128)));
        } while (++i < arr.length);
        System.out.println("\nПоток записи завершил работу\n");
    }
}
