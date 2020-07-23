package com.genius.samples.staticexamples;

public class StaticMethodExample {

    public static void sayHelloWorld(String name) {
        System.out.println("Hello "+name);
    }

    public static void main(String[] args) {
        StaticMethodExample.sayHelloWorld("manoj");

        StaticMethodExample staticMethodExample = new StaticMethodExample();
        staticMethodExample.sayHelloWorldFromNonStaticMethod("manoj");
    }

    public void sayHelloWorldFromNonStaticMethod(String name) {
        System.out.println("Hello "+name);
    }

}
