package com.diu.dp;

public class Teacher extends Person{
    private String designation;
    private int id;
    private String dept;

    public Teacher(){}
    public Teacher(int id,String name,String dept,String des) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.designation = des;
    }
    public void printPerson()
    {
        super.printPerson();
        System.out.println("Teacher's ID: " + id + "\nDept: " + dept + "\nDesignation: "+designation+ "\n");
    }

}
