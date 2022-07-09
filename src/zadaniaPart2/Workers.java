package zadaniaPart2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Workers {

    private String name;
    private String lastName;
    private int age;
    private int heightInCM;
    private Sex sex;
    private String whenHired;

    public Workers(String name, String lastName, int age, int height, Sex sex, String whenHired) {
        this.name = name;
        this.lastName = lastName;
        this.whenHired = whenHired;
        this.age = age;
        this.heightInCM = height;
        this.sex = sex;

    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeightInCM() {
        return heightInCM;
    }

    public Sex getSex() {
        return sex;
    }

    public String getWhenHired() {
        return whenHired;
    }
}

