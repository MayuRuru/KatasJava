package katas.katas.BremenKata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void catsHaveNameAndSound(){
        Cat cat = new Cat();
        assertThat(cat, hasProperty("name"));
        assertThat(cat, hasProperty("sound"));
    }

    @Test
    void catsStartNotSinging(){
        Cat cat = new Cat();
        assertFalse(cat.singing());
    }

    @Test
    void catsCanStartSinging(){
        Cat cat = new Cat();
        cat.startsSinging();
        assertTrue(cat.singing());
    }

    @Test
    void catsCanStartSinging(){
        Cat cat = new Cat();
        cat.startsSinging();
        cat.stopsSinging();
        assertFalse(cat.singing());
    }

}