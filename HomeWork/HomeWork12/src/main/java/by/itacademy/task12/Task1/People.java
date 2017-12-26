package by.itacademy.task12.Task1;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by daryatratseuskaya on 12/15/17
 */
public class People {
//    @JsonProperty("isDegree")

    private String id;
    private int age;
    private boolean degreeJS;
    private String name;
    private String surname;

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public boolean isDegreeJS() {

        return degreeJS;
    }

    public void setDegreeJS(boolean degreeJS) {
        this.degreeJS = degreeJS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o;

        if (age != people.age) return false;
        if (degreeJS != people.degreeJS) return false;
        if (id != null ? !id.equals(people.id) : people.id != null) return false;
        if (name != null ? !name.equals(people.name) : people.name != null) return false;
        return surname != null ? surname.equals(people.surname) : people.surname == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (degreeJS ? 1 : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", degreeJS=" + degreeJS +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
