package races;

/**
 * Created by Администратор on 23.01.2017.
 */
public class main {
    public static void main(String[] args) {
        int myArray[] = new int[100];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }

        WriteThread thread2 = new WriteThread(myArray);
        ReadThread thread1 = new ReadThread(myArray);

        System.out.println("\nГлавный поток ожидает другие потоки\n");
        try {
            thread1.t.join();
            thread2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
    }
}
