package com.genius.samples.oops.runtimepolymorphism;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.printShape(args[0]);
    }

    public void printShape(String type) {
        Shape s = null;
        if(type.equals("Circle")) {
             s = new Circle();
        } else if(type.equals("Square")) {
             s = new Square();
        }
        String shape = s.getShape();
        System.out.println(shape);
    }
}
