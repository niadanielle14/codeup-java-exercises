package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student() {
    }

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double listItems = grades.size();
        double gradesTotal = 0;
        for (Integer grade : grades) {
            gradesTotal += grade;
        }
        return gradesTotal/listItems;
    }
}