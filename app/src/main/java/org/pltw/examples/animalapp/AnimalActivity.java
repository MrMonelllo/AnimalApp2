package org.pltw.examples.animalapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalActivity extends ActionBarActivity {

    public static TextView output;
    ArrayList<Animal> animals;
    public static ArrayList<String> lines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        output = (TextView) findViewById(R.id.output);

        Animal duck = new Duck();
        Animal fish = new Fish();
        Animal seal = new Seal();
        Animal fox = new Fox();
        animals = new ArrayList<>();
        lines = new ArrayList<>();

        animals.add(duck);
        animals.add(fish);
        animals.add(seal);
        animals.add(fox);
        lines.add("Ring-ding-ding-ding-dingeringeding!");
        lines.add("Wa-pa-pa-pa-pa-pa-pow!");
        lines.add("Hatee-hatee-hatee-ho!");
        lines.add("Joff-tchoff-tchoffo-tchoffo-tchoff!");
        lines.add("Chacha-chacha-chacha-chow!");
        lines.add("Fraka-kaka-kaka-kaka-kow!");
        lines.add("A-hee-ahee ha-hee!");
        lines.add("A-oo-oo-oo-ooo!");

        for (Animal a: animals) {
            this.output.append("\n" + a.getClass().getSimpleName() + " says " + a.Say());
            if (a instanceof Seal) {
                this.output.append("\n" + ((Seal)a).play());
            }
            if (a instanceof Fox){
                this.output.append("\n" + ((Fox)a).play());
            }
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_animal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
