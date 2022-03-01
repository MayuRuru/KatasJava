package katas.katas.BremenKata;

public class Cat {
   protected String name;
   protected String sound;
   protected Boolean singing = false;


   public Cat(String name, String sound) {
      this.name = name;
      this.sound = sound;
   }
   public Cat() {
   }

   public String getName() {
      return name;
   }

   public String getSound() {
      return sound;
   }

   public boolean startsSinging() {
      return this.singing = true;
   }

   public boolean stopsSinging() {
      return this.singing = false;
   }

   public String message() {
      if (this.singing) {
         return "The cat " + this.name + " is singing" + this.sound;}
      return "The cat " + this.name + " refuses to sing";
   }
}
