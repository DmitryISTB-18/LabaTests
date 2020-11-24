package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest {



    @Test
    void ColichestvoTestFish() {
        int fish = new Fish("Акула", Habitat.SEA).quanAni();
        assertEquals(5, fish);
    }

    @Test
    void ColichestvoTestBirds() {
        int birds = new Birds("Синица", false ).quanAni();
        assertEquals(6, birds);
    }

}