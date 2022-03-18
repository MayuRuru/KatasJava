package katas.katas.BremenKata;

import java.util.ArrayList;

public class Director {
    ArrayList<Animal> band = new ArrayList<>();

    public Director(ArrayList<Animal> band){
        this.band = band;
    }

    public void startSing() {
        for (Animal animal : band) {
            animal.startsSinging();
        }
    }

    public void stopSing() {
        for (Animal animal : band) {
            animal.stopsSinging();
        }
    }

}
