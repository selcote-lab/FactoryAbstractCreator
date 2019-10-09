package com.tonasolution;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }
}

class RectangleFactory extends AbstractShapeFactory {
    protected  Shape factoryMethod(){
        return new Rectangle();
    }
}

class CircleFactory extends AbstractShapeFactory {
    protected  Shape factoryMethod(){
        return new Circle();
    }
}

