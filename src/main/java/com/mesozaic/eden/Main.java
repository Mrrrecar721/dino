package com.mesozaic.eden;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final String welcomeMessage = "Welcome to Mesozaic Eden!";
        final String safetyMessage = "Be safe and be aware of your surroundings at all time!";
        final String openingHours = "08:00";
        final String closingHours = "20:00";
        final int MAX_GUEST = 750;
        Employee RICHARD_RECAR = new Employee("Richard", "Recar", 38);
        Dinosaur Tyran1 = new Dinosaur("bleep", "blop", 2, 3450f,"carnivore");
        Dinosaur Tyran2 = new Dinosaur("bleep", "bloper", 27, 15250f,"carnivore");
        float WEIGHT_AVG = avgWeight(Tyran1, Tyran2);



        // Park Sign
        System.out.println("|----------------------" +
                welcomeMessage + "--------------------|\n|------" +
                safetyMessage + "-------|\n|-----------------We are open from " +
                openingHours + " Until " +
                closingHours + "----------------|\n");

        System.out.println("The max number of guests is " + MAX_GUEST);

        System.out.println(RICHARD_RECAR);

        System.out.println(Tyran1);
        System.out.println("The average weight between T1 and T2 is : " + WEIGHT_AVG + " kilograms.");


    }

    public static float avgWeight(Dinosaur one, Dinosaur two) {
        return (one.getWeight() + two.getWeight()) / 2;
    }

}