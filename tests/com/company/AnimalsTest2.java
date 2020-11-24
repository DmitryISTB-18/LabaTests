package com.company;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest2 {
    static Birds b;
    static Fish f;

    @BeforeAll
    static void obj() {
        b = new Birds("Орёл", false);
        f = new Fish("Карась", Habitat.LIKE);

    }
    @Test
    void countConsBushTest() {
        int birds  = b.quanAni();
        assertEquals(4, birds);
    }

    @Test
    void countConsTreeTest() {
        int fish = f.quanAni();
        assertEquals(6, fish);
    }

    @AfterAll
    static void printEnd(){
        System.out.println("Конец тестирования");
    }
}
