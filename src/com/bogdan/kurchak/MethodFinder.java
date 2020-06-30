package com.bogdan.kurchak;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

/*
 * Implement a method that is will find the class of the provided method by its name.
 * This method accepts two arguments, the name of the method and an array of class names, where:
 * methodName is the fully-qualified name of the method that needs to be found;
 * classNames contains one class that has the method with the given name.
 * It should return the fully-qualified name of the class that has the method with the given name.
 * For example, the method name is abs and possible classes are String, StringBuffer and Math.
 * String and StringBuffer have no method with the name abs. So they are not the class we are looking for.
 * Math class has a method with the name abs. The method should return the fully-qualified name of Math class,
 * java.lang.Math in this case.
 */

/**
 * @author Bogdan Kurchak
 */
class MethodFinder {
    public static String findMethod(String methodName, String[] classNames) throws ClassNotFoundException {
        for (String name : classNames) {
            Method[] methods = Class.forName(name).getMethods();
            System.out.println(Arrays.toString(methods));
            for (Method method : methods) {
                if (Objects.equals(method.getName(), methodName)) {
                    return name;
                }
            }
        }

        return "";
    }
}
