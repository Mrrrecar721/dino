package com.mesozaic.eden;

class Employee {
    String FIRST_NAME = " ", LAST_NAME = " ";
    int age;
    int YEARS_OF_EXPERIENCE = 0;


    public Employee() {
        this.age = 0;
        this.FIRST_NAME = "John";
        this.LAST_NAME = "Doe";
    }
    public Employee(String firstName, String lastName, int age) {
        this.FIRST_NAME = firstName;
        this.LAST_NAME = lastName;
        this.age = age;
    }

    public void setYEARS_OF_EXPERIENCE(int YEARS_OF_EXPERIENCE) {
        this.YEARS_OF_EXPERIENCE = YEARS_OF_EXPERIENCE;
    }

    @Override
    public String toString() {
        return FIRST_NAME + " " + LAST_NAME + " " + age + " " + YEARS_OF_EXPERIENCE;
    }
}
