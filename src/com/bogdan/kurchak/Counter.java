package com.bogdan.kurchak;

/*
 * Implement a method that takes an array of shapes and counts how many objects of classes that
 * extend Shape2D the array contains. Do not count objects of Shape2D, only its subclasses.
 */

/**
 * @author Bogdan Kurchak
 */
class Counter {
    public static int count2DShapes(Shape[] shapes) {
        int counter = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Shape2D && shape.getClass() != Shape2D.class) {
                counter++;
            }
        }
        return counter;
    }
}

class Shape {
}

class Shape2D extends Shape {
}

class Shape3D extends Shape {
}


class Circle extends Shape2D {
}

class Shape2DSub1 extends Shape2D {
}

class Shape2DSub2 extends Shape2D {
}


class Cube extends Shape3D {
}

class Shape3DSub1 extends Shape3D {
}

class Shape3DSub2 extends Shape3D {
}
