package com.genius.samples.oops.thisexample;

public class StudentWithThis extends Teacher{

    int rollno;

    public StudentWithThis() {

    }
    public StudentWithThis(String name) {
        super(name);
    }

    String name;
    float fee;

    public StudentWithThis(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;

    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);

    }

    public static void main(String args[]){
        StudentWithThis s1=new StudentWithThis(111,"ankit",5000f);
        StudentWithThis s2=new StudentWithThis(112,"sumit",6000f);
        StudentWithThis s3=new StudentWithThis("Manoj");
        s1.display();
        s2.display();
        s3.display();
    }
}
