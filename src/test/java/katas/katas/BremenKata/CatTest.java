package katas.katas.BremenKata;

import org.junit.jupiter.api.Test;

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
        assertEquals(cat.message(), "The cat " + cat.name + " is singing" + cat.sound);
    }

    @Test
    void catsSayIfTheyDontSing(){
        Cat cat = new Cat("Kilian", "miauu");
        assertEquals(cat.message(), "The cat " + cat.name + " refuses to sing");
    }

}