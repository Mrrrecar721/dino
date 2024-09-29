package com.mesozaic.eden;

class Employee {
    String FIRST_NAME = " ", LAST_NAME = " ";
    int age;




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
}
