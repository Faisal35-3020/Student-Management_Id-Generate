package com.diu.dp;

public class Student extends Person{
    private String ID;
    private int batch;
    private Semester adSem = new Semester();
    private final int lastSerial = 3000;
    private static int count;

    public Student(){}
    public Student(String name,Department dept,Semester sem,int batch) {
        this.batch = batch;
        this.name = name;
        this.dept = dept;
        this.adSem = sem;
        count++;
        this.ID = genID();
    }
    public String genID()
    {
        int serial = lastSerial+count;
        return adSem.getCode()+"-"+dept.getCode()+"-"+serial;
    }
    public void printPerson()
    {
        System.out.println("Student Name: " + name + "\nID: "+ ID +"\nDept: "+dept.getName()+"\nBatch: "+batch+"\n");
    }


}
