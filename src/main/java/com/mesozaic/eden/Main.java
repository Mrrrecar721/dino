package com.mesozaic.eden;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String welcomeMessage = "Welcome to Mesozaic Eden!";
        String safetyMessage = "Be safe and be aware of your surroundings at all time!";
        String openingHours = "08:00";
        String closingHours = "20:00";
        final int MAX_GUEST = 750;
        Employee RICHARD_RECAR = new Employee("Richard", "Recar", 38);
        Dinosaur Tyran1 = new Dinosaur("bleep", "blop", 27, 1.02f,"carnivore");


        System.out.println("|----------------------" +
                welcomeMessage + "--------------------|\n|------" +
                safetyMessage + "-------|\n|-----------------We are open from " +
                openingHours + " Until " +
                closingHours + "----------------|\n");

        System.out.println("The max number of guests is " + MAX_GUEST);

        System.out.println(RICHARD_RECAR.FIRST_NAME);

        System.out.println(Tyran1.toString());
    }
}