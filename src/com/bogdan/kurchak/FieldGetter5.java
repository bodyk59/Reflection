package com.bogdan.kurchak;

/*
 * Implement getFieldValue method to retrieve the value of public field fieldName from the given object.
 * If the field doesn't exist or it is not available (i.e. has private access modifier), return null.
 */
/**
 * @author Bogdan Kurchak
 */
public class FieldGetter5 {
    public Object getFieldValue(Object object, String fieldName) {
        try {
            return object.getClass().getField(fieldName).get(object);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            return null;
        }
    }
}
