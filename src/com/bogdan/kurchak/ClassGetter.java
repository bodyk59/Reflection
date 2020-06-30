package com.bogdan.kurchak;

/*
 * Implement the method that returns the fully qualified class name of the object provided.
 */

/**
 * @author Bogdan Kurchak
 */
class ClassGetter {
    public String getObjectClassName(Object object) {
        return object.getClass().getName();
    }
}
