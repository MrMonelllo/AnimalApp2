package org.pltw.examples.animalapp;

/**
 * Created by shunt on 10/27/2017.
 */

public class Seal extends Animal implements Fun {
    public Seal(){

    }
    public String Say(){
        return "arf arf";
    }
    public String play(){
        return "The seal bounces the ball.";
    }
}
