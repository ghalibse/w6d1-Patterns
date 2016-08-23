package com.example.patterns.factory;

/**
 * Created by admin on 8/22/2016.
 */
public class AnimalFactory {

    public Fish createFish(){
        return new Fish();
    }

    public Mammal createMammal(){
        return new Mammal();
    }
}
