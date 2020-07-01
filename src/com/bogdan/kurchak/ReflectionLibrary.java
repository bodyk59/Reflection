package com.bogdan.kurchak;

/*
 * William is working on a reflection library that will make the use of reflection easier.
 * He already made many helpful methods. Sadly, William does not know how to retrieve class instances.
 * He asks you to help him finish his library by implementing the last three remaining methods.
 *
 * Task: Implement the following methods:
 *
 * 1. getPrimitiveClass accepts a string name of any primitive type
 * (int, boolean, char, double, etc.) and void.
 * The method should return the class of primitive type.
 * If the primitive type does not exist, your method should return null
 *
 * 2. getClassEncoding accepts a string name of any primitive type, and should return it's encoded form.
 * If the primitive type does not exist, your method should return null
 *
 * 3. getObjectEncoding accepts an instance of any object, and should return it's encoded form.
 */

/**
 * @author Bogdan Kurchak
 */
class ReflectionLibrary {
    public static Class getPrimitiveClass(String typeName) {
        switch (typeName) {
            case "byte":
                return byte.class;
            case "short":
                return short.class;
            case "int":
                return int.class;
            case "long":
                return long.class;
            case "char":
                return char.class;
            case "float":
                return float.class;
            case "double":
                return double.class;
            case "boolean":
                return boolean.class;
            case "void":
                return void.class;
            default:
                return null;
        }
    }

    public static String getClassEncoding(String typeName) {
        switch (typeName) {
            case "byte":
                return "[B";
            case "short":
                return "[S";
            case "int":
                return "[I";
            case "long":
                return "[J";
            case "char":
                return "[C";
            case "float":
                return "[F";
            case "double":
                return "[D";
            case "boolean":
                return "[Z";
            default:
                return null;
        }
    }

    public static String getObjectEncoding(Object object) {
        return "[[L" + object.getClass().getName() + ";";
    }
}
