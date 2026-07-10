package java_training_;

import java.util.*;

class SmartStudent {
    private String name;
    private int id;

    public SmartStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "SmartStudent{id=" + id + ", name='" + name + "'}";
    }
}

class NameComparator implements Comparator<SmartStudent> {
    @Override
    public int compare(SmartStudent s1, SmartStudent s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

public class StudentComparator {
    public static void main(String[] args) {
        List<SmartStudent> students = new ArrayList<>();
        students.add(new SmartStudent(101, "Charlie"));
        students.add(new SmartStudent(102, "Alice"));
        students.add(new SmartStudent(103, "Bob"));

        System.out.println("Before Sorting:");
        for (SmartStudent s : students) {
            System.out.println(s);
        }

        Collections.sort(students, new NameComparator());

        System.out.println("\nAfter Sorting by Name:");
        for (SmartStudent s : students) {
            System.out.println(s);
        }
    }
}