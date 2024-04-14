package com.tns.multilevel;

public class Animal {


    String species;

    Animal(String species) {
        this.species = species;
    }

    void sound() {
        // Each animal subclass will define its own sound
    }
}
