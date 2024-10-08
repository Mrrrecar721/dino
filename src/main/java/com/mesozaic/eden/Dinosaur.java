package com.mesozaic.eden;

public class Dinosaur {
    String DINO_SPECIES = " ";
    String DINO_NAME;
    String DIET;
    int DINO_AGE;
    float DINO_WEIGHT;
    float FOOD_NEEDED;
    String ENCLOSURE_TYPE;

    public Dinosaur(String species, String name, int age, float weight, String diet) {
        DINO_SPECIES = species;
        DINO_NAME = name;
        DINO_AGE = age;
        DINO_WEIGHT = weight;
        DIET = diet;
        FOOD_NEEDED = FOOD_PER_MEAL();

        ENCLOSURE_TYPE = switch (species){
            case "Tyrannosaurus", "TRex" -> ENCLOSURE_TYPE = "XL";
            case "Stegosaurus" -> ENCLOSURE_TYPE = "L";
            case "Velociraptor" -> ENCLOSURE_TYPE = "M";

            default -> throw new IllegalStateException("Unexpected value: " + species);
        };
    }


    public String getSpecies() {return DINO_SPECIES;}
    public String getName() {return DINO_NAME;}
    public int getAge() {return DINO_AGE;}
    public float getWeight() {return DINO_WEIGHT;}
    public String getDiet() {return DIET;}

    public void setDINO_NAME(String DINO_NAME) {this.DINO_NAME = DINO_NAME;}
    public void setDINO_SPECIES(String DINO_SPECIES) {this.DINO_SPECIES = DINO_SPECIES;}
    public void setCARNIVORE(String DIET) {this.DIET = DIET;}
    public void setDINO_WEIGHT(float DINO_WEIGHT) {this.DINO_WEIGHT = DINO_WEIGHT;}
    public void setDINO_AGE(int DINO_AGE) {this.DINO_AGE = DINO_AGE;}

    @Override
    public String toString() {
       return "Meet " +
                DINO_NAME + " a " +
                DINO_AGE + "-year old " +
                DINO_SPECIES + ". As a " +
                DIET + ", it has a robust weight of " +
                DINO_WEIGHT + " kilograms. He/She requires " + FOOD_NEEDED + "kg of food per meal.";
    }

    public float FOOD_PER_MEAL(){
        return (this.DINO_WEIGHT * .05f)/2;
    }
}
