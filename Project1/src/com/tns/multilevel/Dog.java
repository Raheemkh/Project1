package com.tns.multilevel;

public class Dog extends Animal {
	
	
    String breed;

    Dog(String breed) {
        super("Dog");
        this.breed = breed;
    }

	void sound() {
        System.out.println("Woof!");
    }
}


