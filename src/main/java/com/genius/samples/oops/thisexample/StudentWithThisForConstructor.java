package com.genius.samples.oops.thisexample;

public class StudentWithThisForConstructor {

    int rollno;
    String name,course;
    float fee;

    //Calling parameterized constructor from default constructor:
    public StudentWithThisForConstructor(){
        this(5);
        System.out.println("hello a");
    }

    //Calling default constructor from parameterized constructor:
    public StudentWithThisForConstructor(int x){
        //this();
        System.out.println(x);
    }

    public StudentWithThisForConstructor(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    //constructor chaining
    public StudentWithThisForConstructor(int rollno,String name,String course,float fee){
        this(rollno,name,course);//reusing constructor
        this.fee=fee;
    }
}
