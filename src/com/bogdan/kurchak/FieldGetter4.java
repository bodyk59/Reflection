package com.bogdan.kurchak;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Implement getPrivateFields method to list the names of private fields declared in the class the object belongs to.
 * Fields inherited from parent classes should be omitted. Field names should be sorted in lexical order.
 * Here we use List<String> since it's more appropriate for the task. Check out the docs if you're not familiar with it.
 */

/**
 * @author Bogdan Kurchak
 */
public class FieldGetter4 {
    public List<String> getPrivateFields(Object object) {
        return Arrays.stream(object.getClass().getDeclaredFields())
                .filter(field -> Modifier.isPrivate(field.getModifiers()))
                .map(Field::getName)
                .sorted()
                .collect(Collectors.toList());
    }
}
