package com.bogdan.kurchak;

import java.lang.reflect.Field;
import java.util.Arrays;

/*
 * Implement the getFieldsContainingAnnotations method that lists the names of the fields declared in the object.
 * The list should include all the fields containing at least one annotation.
 * Fields inherited from parent classes should be omitted.
 */

/**
 * @author Bogdan Kurchak
 */
public class AnnotationsUtil {
    public static String[] getFieldsContainingAnnotations(Object object) {
        return Arrays.stream(object.getClass().getDeclaredFields())
                .filter(field -> field.getDeclaredAnnotations().length > 0)
                .map(Field::getName)
                .toArray(String[]::new);
    }
}
