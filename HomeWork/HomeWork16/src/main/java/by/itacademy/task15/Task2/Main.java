package by.itacademy.task15.Task2;

/**
 * Created by daryatratseuskaya on 1/22/18
 * Усовершенствовать предыдущее приложение,
 * обеспечив синхронизацию за счет объявления вызова print10() синхронизированным.
 */
public class Main {

    public static void main(String[] args) {

        TestSyncThread thread1 = new TestSyncThread();
        TestSyncThread thread2 = new TestSyncThread();
        thread1.setName("Thread №1");
        thread2.setName("Thread №2");
        thread1.start();
        thread2.start();
    }

    public synchronized static void print10() {
        for (int i = 0; i < 10; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = i * 10 + 1; j < i * 10 + 11; j++) {
                stringBuilder.append(j);
                stringBuilder.append(" ");
            }
            System.out.println(Thread.currentThread().getName() + " " + stringBuilder.toString());
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
