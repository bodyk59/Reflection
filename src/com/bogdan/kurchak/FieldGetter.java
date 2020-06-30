package com.bogdan.kurchak;

/*
 * Implement the getNumberOfAccessibleFields method to count the number of accessible public fields of the class
 * or interface represented by the clazz object.
 */

/**
 * @author Bogdan Kurchak
 */
class FieldGetter {

    public int getNumberOfAccessibleFields(Class<?> clazz) {
        return clazz.getFields().length;
    }

}