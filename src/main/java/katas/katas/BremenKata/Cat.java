package katas.katas.BremenKata;

public class Cat extends Animal {
   public Cat(String name, String sound) {
     super (name, sound);
   }
   public Cat() {
   }

   public String message() {
      if (this.singing) {
         return "The cat " + this.name + " is singing " + this.sound;}
      return "The cat " + this.name + " refuses to sing";
   }
}
