package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


class DiversionTest {

    private final Diversion diversion = new Diversion();

    @Test
    void getPermutationsTest1() {
        //Arrange

        //Act
        List<String> permutations = diversion.getPermutations(3);

        //Assert
        assertEquals(8, permutations.size());
    }

    @Test
    void getPermutationsTest2() {
        //Arrange

        //Act
        List<String> permutations = diversion.getPermutations(4);

        //Assert
        assertEquals(16, permutations.size());
    }

    @Test
    void getPermutationsTest3() {
        //Arrange

        //Act
        List<String> permutations = diversion.getPermutations(5);

        //Assert
        assertEquals(32, permutations.size());
    }

    @Test
    void filterAdjacentsTest() {
        //Arrange
        List<String> permutations = diversion.getPermutations(3);

        //Act
        List<String> result = diversion.filterAdjacents(permutations);

        //Assert
        assertFalse(result.contains("110"));
        assertFalse(result.contains("111"));
        assertFalse(result.contains("011"));
        assertEquals(5, result.size());
    }
}