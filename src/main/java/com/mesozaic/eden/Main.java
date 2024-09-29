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
        Dinosaur Tyran1 = new Dinosaur("bleep", "blop", 2, 6.02f,"carnivore");
        Dinosaur Tyran2 = new Dinosaur("bleep", "bloper", 27, 12.06f,"carnivore");
        float WEIGHT_AVG = avgWeight(Tyran1, Tyran2);

        float FOOD_FOR_DINO1 = FOOD_NEEDED(Tyran1);

        // Park Sign
        System.out.println("|----------------------" +
                welcomeMessage + "--------------------|\n|------" +
                safetyMessage + "-------|\n|-----------------We are open from " +
                openingHours + " Until " +
                closingHours + "----------------|\n");

        System.out.println("The max number of guests is " + MAX_GUEST);

        System.out.println(RICHARD_RECAR.FIRST_NAME);

        System.out.println(Tyran1);
        System.out.println("The average weight between T1 and T2 is : " + WEIGHT_AVG + " kilograms.");
        System.out.println("Dinosaur one requires " + FOOD_FOR_DINO1 + " pounds of food per day.");

    }

    public static float avgWeight(Dinosaur one, Dinosaur two) {
        return (one.getWeight() + two.getWeight()) / 2;
    }

    public static float FOOD_NEEDED (Dinosaur one) {
        // .25 pounds of food per kg
        return one.DINO_WEIGHT * .45f;
    }

}