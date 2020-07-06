package com.bogdan.kurchak;

/*
 * Unfortunately, the author of this class hierarchy forgot to add the getArea() method to these classes.
 * Now you need to implement a method that calculates the sum of areas of the Shape array.
 * If some elements are instances of the class Shape, their area equals 0.
 */
/**
 * @author Bogdan Kurchak
 */
class Sum {
    public static int sumOfAreas(Shapes[] array) {
        int result = 0;
        for (Shapes shape : array) {
            if (shape.getClass() == Square.class) {
                result += Math.pow(((Square) shape).getSide(), 2);
            }

            if (shape.getClass() == Rectangle.class) {
                result += (((Rectangle) shape).getHeight() * ((Rectangle) shape).getWidth());
            }
        }
        return result;
    }
}

class Shapes {
}

class Square extends Shapes {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

class Rectangle extends Shapes {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
