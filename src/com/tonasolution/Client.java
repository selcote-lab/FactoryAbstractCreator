package com.tonasolution;

public class Client {

    public static void main(String[] args) {
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();

        Shape shape2 = new RectangleFactory().getShape();
        shape2.draw();
    }
}
