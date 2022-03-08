package katas.katas.BremenKata;

public class Donkey extends Animal {

    public Donkey(String name, String sound) {
        super(name, sound);
    }

    public Donkey(){
    }

    public String message() {
        if (this.singing) {
            return "The donkey " + this.name + " is singing " + this.sound;}
        return "The donkey " + this.name + " refuses to sing";
    }

}
