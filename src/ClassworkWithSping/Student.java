package ClassworkWithSping;

import java.util.ArrayList;

/**
 * Created by 1 on 26.02.2016.
 */

public class Student {
    private String name;

    public Institute getInstitute() {
        return institute;
    }

    private Institute institute;
    private ArrayList<Lesson> lessons;

    public String getName() {
        return name;
    }



    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    Student(String name, Institute institute, ArrayList<Lesson> lessons) {
        this.institute = institute;
        this.lessons = lessons;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", institute='" + institute + '\'' +
                ", lessons=" + lessons +
                '}';
    }
}