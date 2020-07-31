package com.genius.samples.patterns.facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        //delegates calls to the concrete classes

        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
