package com.genius.samples.patterns.facade;

import com.genius.samples.patterns.Rectangle;
import com.genius.samples.patterns.Shape;
import com.genius.samples.patterns.Square;

public class ShapeMaker {

    //facade or interface to the different shapes. Clients dont have to instantiate different shapes. They
    // just call the drawSqaure and drawRectangle methods
    //we are hiding implementation details frrom clients. We might not want to share how draw is implemented

    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {

        rectangle = new Rectangle();
        square = new Square();
    }


    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
