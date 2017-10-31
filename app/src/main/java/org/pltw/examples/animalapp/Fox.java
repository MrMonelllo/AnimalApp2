package org.pltw.examples.animalapp;

import java.util.ArrayList;

import static java.lang.Math.random;

/**
 * Created by shunt on 10/27/2017.
 */

public class Fox extends Animal implements Fun {
    private int random;
    public Fox(){

    }
    public String play(){
        return "The fox chases the mice and digs holes!!!!!!1111!!";
    }
    public String Say(){
        random = (int) (Math.random()*8);
        return AnimalActivity.lines.get(random);
    }
}
