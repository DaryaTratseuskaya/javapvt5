package by.itacademy.task14.Task1;

import java.lang.reflect.Field;

/**
 * Created by daryatratseuskaya on 1/10/18
 * Создать класс с 3 private полями (String, int и float).
 * Используя рефлексию заполнить поля любыми данными.
 * Затем создать геттеры для этих полей.
 * Сделать вызов методов (геттеров) через рефлексию и распечатать то что метод возвращает.
 */
public class Reflection {
    public static void main(String[] args) {
        Data data = new Data();

        Class classTest = data.getClass();
        System.out.println(classTest.getName());

        try {
            Field f = data.getClass().getDeclaredField("text");
            f.setAccessible(true);
            System.out.println(data.getText());
            data.setText("Alex");
            System.out.println(data.getText());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        try {
            Field f = data.getClass().getDeclaredField("number");
            f.setAccessible(true);
            System.out.println(data.getNumber());
            data.setNumber(16);
            System.out.println(data.getNumber());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        try {
            Field f = data.getClass().getDeclaredField("field");
            f.setAccessible(true);
            System.out.println(data.getField());
            data.setField(120);
            System.out.println(data.getField());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
