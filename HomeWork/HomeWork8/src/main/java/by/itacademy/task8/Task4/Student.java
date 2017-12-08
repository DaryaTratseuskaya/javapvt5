package by.itacademy.task8.Task4;

/**
 * Created by daryatratseuskaya on 12/8/17
 */
public class Student {

    private String firstName;
    private String lastName;
    private String secondName;
    private int age;
    private String diagnosis;
    private boolean OnFile;

    public boolean isOnFile() {
        return OnFile;
    }

    public void setOnFile(boolean onFile) {
        OnFile = onFile;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
