package Zadania.Zadanie_17;

public class Employee {

    private String name;
    private String surname;
    private int age;
    private int height;
    private String sex;
    private String dateOfEmployment;

    public Employee(String name, String surname, int age, int height, String sex, String dateOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.sex = sex;
        this.dateOfEmployment = dateOfEmployment;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", sex='" + sex + '\'' +
                ", dateOfEmployment='" + dateOfEmployment + '\'' +
                '}';
    }
}
