package com.bogdan.kurchak;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/*
 * Implement the getPublicFields method that returns String array with names of public fields declared
 * in the class object belongs to. Fields inherited from parent classes should be omitted.
 */

/**
 * @author Bogdan Kurchak
 */
public class FieldGetter3 {
    public String[] getPublicFields(Object object) {
        return Arrays.stream(object.getClass().getDeclaredFields())
                .filter(field -> Modifier.isPublic(field.getModifiers()))
                .map(Field::getName)
                .toArray(String[]::new);
    }
}
