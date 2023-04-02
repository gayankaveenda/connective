package com.interview.connective.entity;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerTests {

    @Tag("ignore")
    @Test
    public void testAddMaxInteger() {
        assertEquals(2147483646, Integer.sum(2147183646, 300000));
    }

    @Tag("mandatory")
    @ParameterizedTest
    @MethodSource
    public void containerMaxAreaWater(int[] input, int output) {
        Integer[] intArray = Arrays.stream(input).boxed().toArray(Integer[]::new);
        assertEquals(new Container(intArray).calculateMaxAreaOfWater(), output);
    }

    public static Stream<Arguments> containerMaxAreaWater() {
        return Stream.of(
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{4, 3, 2, 1, 4}, 16),
                Arguments.of(new int[]{4, 3, 2, 1, 4, 6, 2}, 20),
                Arguments.of(new int[]{1, 2, 1}, 2),
                Arguments.of(new int[]{1, 1}, 1)
        );
    }
}
