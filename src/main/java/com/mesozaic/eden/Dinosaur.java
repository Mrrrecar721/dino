package com.mesozaic.eden;

public class Dinosaur {
    String DINO_SPECIES = " ";
    String DINO_NAME;
    String DIET;
    int DINO_AGE;
    float DINO_WEIGHT;

    public Dinosaur(String species, String name, int age, float weight, String diet) {
        DINO_SPECIES = species;
        DINO_NAME = name;
        DINO_AGE = age;
        DINO_WEIGHT = weight;
        DIET = diet;
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

    @Override public String toString() {
        System.out.println("Meet " +
                DINO_NAME + " a " +
                DINO_AGE + "-year old " +
                DINO_SPECIES + ". As a " +
                DIET + ", it has a robust weight of " +
                DINO_WEIGHT + " kilograms.");
        return null;
    }


}
