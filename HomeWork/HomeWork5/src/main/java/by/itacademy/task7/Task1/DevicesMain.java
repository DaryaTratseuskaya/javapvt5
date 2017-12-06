package by.itacademy.task7.Task1;

/**
 * Created by daryatratseuskaya on 11/27/17
 */
public class DevicesMain {
    public static void main(String[] args) {


     Devices devices = new Devices();
     devices.setProducer("Apple");
     devices.setReleaseDate("December 2017");

    printInfo(devices);

    Notebook notebook = new Notebook();
    notebook.setProducer("Asus");

    printInfo(notebook); // обращается к методу класса Devices, потому что унаследован от Devices и метод не переопределен

        SmartWatch smartWatch = new SmartWatch("Fitness", true, "Plastic");

        printInfo(smartWatch);


    }

    public static void printInfo(Producer producer){
        System.out.println(producer.printProducer());


    }


}
