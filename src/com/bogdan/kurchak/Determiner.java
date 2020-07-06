package com.bogdan.kurchak;

/*
 * You are given a class hierarchy consisting of three classes. The base class is Employee.
 * The first subclass is Developer, the second subclass is DataAnalyst.
 * Implement a method determineWhoIsWho. The method takes an array of employees.
 * Each element belongs to one of the listed classes.
 * The method should output the type (DEV, EMP or DA) of each element in a new line.
 * Use the provided template for your method.
 */
/**
 * @author Bogdan Kurchak
 */

public class Determiner {
    public static void determineWhoIsWho(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.getClass() == DataAnalyst.class) {
                System.out.println("DA");
            } else if (employee.getClass() == Developer.class) {
                System.out.println("DEV");
            } else {
                System.out.println("EMP");
            }
        }
    }
}

class Employee {

    protected String name;
    protected String email;
    protected int experience;

    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }
}

class Developer extends Employee {

    private String mainLanguage;
    private String[] skills;

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }
}

class DataAnalyst extends Employee {

    private boolean phd;
    private String[] methods;

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }

    public boolean isPhD() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }
}
