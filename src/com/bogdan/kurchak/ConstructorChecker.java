package com.bogdan.kurchak;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/*
 * Implement checkPublicParameterlessConstructor that returns true if the provided class declares public parameterless
 * constructor and false otherwise.
 */

/**
 * @author Bogdan Kurchak
 */
public class ConstructorChecker {
    public boolean checkPublicParameterlessConstructor(Class<?> clazz) {
        return Arrays.stream(clazz.getConstructors())
                .map(Constructor::getParameters)
                .anyMatch(parameters -> parameters.length == 0);
    }
}
