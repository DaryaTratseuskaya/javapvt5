package by.itacademy.task10.Task2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by daryatratseuskaya on 12/18/17
 *
 * Создать объект в котором хранится имя, фамилия и отчество. Дальше создать 2 массива с данными с типом этого объекта (ФИО).
 * В одном содержатся мужские ФИО, в другом женские.
 Заполнить их подходящими данными. Все массивы записать в HashMap с ключами "man",
 "woman" соответственно.
 Дальше пользователь вводить мужское или женское ФИО он хочет вывести и в соответствии
 с этим рандомно вытаскиваем значения из массива который хранится в HashMap.
 Т. е. на экран должно вывести рандомное ФИО из массива.

 */
public class Main {
    public static void main(String[] args) {

        List<Person> men = new ArrayList<>();
        men.add(new Person("Ivan Aleksandrovich Petrov","m"));
        men.add(new Person("Sergey Olegovich Ivanov","m"));
        men.add(new Person("Petr Maksimovich Smolov","m"));

        List<Person> women = new ArrayList<>();
        women.add(new Person("Alena Petrovna Kozlova","w"));
        women.add(new Person("Marina Sergeevna Vertova","w"));
        women.add(new Person("Olga Vasilevna Monich","w"));


        Map<String, List<Person>> map = new HashMap<>();
        map.put("m",men);
        map.put("w",women);

        int rndIndex = (int) (map.get("m").size() * Math.random());
        int rndIndex1 = (int) (map.get("w").size() * Math.random());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'm - man' or 'w - woman' ");

        String input = scanner.next();
        if ("m".equals(input))
        {
            System.out.println("man name is " + map.get("m").get(rndIndex).getFIO());
        }else
            System.out.println("woman name is " + map.get("w").get(rndIndex1).getFIO());

    }
}
