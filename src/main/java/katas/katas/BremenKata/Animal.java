package katas.katas.BremenKata;

public abstract class Animal {
    protected String name;
    protected String sound;
    protected Boolean singing = false;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public Animal(){
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public boolean singing() { return singing; }

    public boolean startsSinging() {
        return this.singing = true;
    }

    public boolean stopsSinging() {
        return this.singing = false;
    }

    public String message() {
        if (this.singing) {
            return "The animal " + this.name + " is singing " + this.sound;}
        return "The animal " + this.name + " refuses to sing";
    }
}
