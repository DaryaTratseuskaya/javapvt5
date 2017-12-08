package by.itacademy.task8.Task4;

/**
 * Created by daryatratseuskaya on 11/21/17
 */
public class Patient {

    private String firstName;
    private String lastName;
    private String secondName;
    private int age;
    private String diagnosis;
    private boolean isOnFile;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setOnFile(boolean onFile) {
        isOnFile = onFile;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public boolean isOnFile() {
        return isOnFile;
    }
}
