package katas.katas.BremenKata;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void catsHaveNameAndSound(){
        Cat cat = new Cat("Kilian", "miauu");
        assertThat(cat, hasProperty("name"));
        assertThat(cat, hasProperty("sound"));
    }

    @Test
    void catsStartNotSinging(){
        Cat cat = new Cat("Kilian", "miauu");
        assertFalse(cat.singing);
    }

    @Test
    void catsCanStartSinging(){
        Cat cat = new Cat("Kilian", "miauu");
        cat.startsSinging();
        assertTrue(cat.singing);
    }

    @Test
    void catsCanStopSinging(){
        Cat cat = new Cat("Kilian", "miauu");
        cat.startsSinging();
        cat.stopsSinging();
        assertFalse(cat.singing);
    }

    @Test
    void catsSayIfTheySing(){
        Cat cat = new Cat("Kilian", "miauu");
        cat.startsSinging();
        assertEquals(cat.message(), "The cat " + cat.name + " is singing " + cat.sound);
    }

    @Test
    void catsSayIfTheyDontSing(){
        Cat cat = new Cat("Kilian", "miauu");
        assertEquals(cat.message(), "The cat " + cat.name + " refuses to sing");
    }

    @Test
    void donkeysSayIfTheySing(){
        Donkey donkey = new Donkey("Manolo", "OiOi");
        donkey.startsSinging();
        assertEquals(donkey.message(), "The donkey " + donkey.name + " is singing " + donkey.sound);
    }

    @Test
    void donkeysSayIfTheyDontSing(){
        Donkey donkey = new Donkey("Manolo", "OiOi");
        assertEquals(donkey.message(), "The donkey " + donkey.name + " refuses to sing");
    }

    @Test
    void directorCanOrderManyAnimalsToSing(){
        ArrayList<Animal> band = new ArrayList<>();
        band.add(new Cat("Yenny", "Meow"));
        band.add(new Donkey("Burro", "IoIo"));

        Director director = new Director(band);
        director.startSing();

        assertEquals("The cat Yenny is singing Meow", band.get(0).message());
        assertEquals("The donkey Burro is singing IoIo", band.get(1).message());
    }

    @Test
    void directorCanOrderManyAnimalsToShutUp(){
        ArrayList<Animal> band = new ArrayList<>();
        band.add(new Cat("Yenny", "Meow"));
        band.add(new Donkey("Burro", "IoIo"));

        Director director = new Director(band);
        director.startSing();
        director.stopSing();

        assertEquals("The cat Yenny refuses to sing", band.get(0).message());
        assertEquals("The donkey Burro refuses to sing", band.get(1).message());

    }


}