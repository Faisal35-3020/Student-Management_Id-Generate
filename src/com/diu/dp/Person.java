package com.diu.dp;

public abstract class Person {
    protected String name;
    protected Department dept = new Department();

    public Person(){}
    public Person(String name,Department dept){
        this.name = name;
        this.dept = dept;

    }
    public void printPerson()
    {
        System.out.println("Name: " + name);

    }
}
