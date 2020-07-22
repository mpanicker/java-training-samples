package com.genius.samples.oops.thisexample;

public class Student {
    int rollno;
    String name;
    float fee;

    public Student(int rollno, String name, float fee) {
        rollno = rollno;
        name = name;
        fee = fee;

    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }

    public static void main(String args[]){
        Student s1=new Student(111,"ankit",5000f);
        Student s2=new Student(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}

