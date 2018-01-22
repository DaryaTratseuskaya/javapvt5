package by.itacademy.task15.Task1;

/**
 * Created by daryatratseuskaya on 1/22/18
 * Написать приложение, в котором используются 2 потока(класс один и тот же).
 * Класс потока задать как наследник Thread. Класс потока должен обеспечивать в методе run построчный
 * несинхронизированный вывод в консольное окно чисел от 1 до 100 порциями по 10 чисел в строке,
 * разделенных пробелами, причем перед каждой такой порцией должна стоять надпись:
 * "Thread 1:" для первого потока, "Thread 2:" — для второго  - можно использовать название потока
 * (есть соответствующий метод).
 * Для вывода строки чисел задать в Main классе метод print10() - в нем запускать цикл на печать 10-ти чисел.
 * В приложении при вводе с клавиатуры "start" потоки должны стартовать.
 */
public class Main {

    public static void main(String[] args) {

        TestThread thread1 = new TestThread();
        TestThread thread2 = new TestThread();
        thread1.setName("Thread #1");
        thread2.setName("Thread #2");
        thread1.start();
        thread2.start();
    }

    public static void print10() {
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
