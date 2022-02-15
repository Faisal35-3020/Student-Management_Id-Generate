package com.diu.main;

import com.diu.dp.Student;
import com.diu.dp.Teacher;
import com.diu.dp.Department;
import com.diu.dp.Semester;

public class StudentManagement {

    public static void main(String[] args) {
        Department dept = new Department("SWE",35);
        Semester sem = new Semester("Spring 2022",221);

        Student s1 = new Student("Faisal",dept,sem,31);
        Student s2 = new Student("Arnob",dept,sem,31);
        s1.printPerson();
        s2.printPerson();

        Teacher t1 = new Teacher(710000001,"ABC","SWE","Lecturer");
        Teacher t2 = new Teacher(710000002,"XYZ","SWE","Lecturer");

        t1.printPerson();
        t2.printPerson();

    }
}
