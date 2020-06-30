package com.bogdan.kurchak;

/*
 * Implement getNumberOfFieldsClassDeclares method to count the number of fields declared in a class.
 * You should count public, protected, default (package) access, and private fields, excluding inherited fields.
 */
/**
 * @author Bogdan Kurchak
 */
public class FieldGetter2 {
    public int getNumberOfFieldsClassDeclares(Class<?> clazz) {
        return clazz.getDeclaredFields().length;
    }
}
