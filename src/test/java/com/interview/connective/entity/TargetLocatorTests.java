package com.interview.connective.entity;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TargetLocatorTests {

    @Tag("mandatory")
    @ParameterizedTest
    @MethodSource
    public void containerMaxAreaWater(int[] input, int target, String output) {
        Integer[] intArray = Arrays.stream(input).boxed().toArray(Integer[]::new);

        assertEquals(new TargetLocator(intArray, target).searchTarget(), output);
    }

    public static Stream<Arguments> containerMaxAreaWater() {
        return Stream.of(
                Arguments.of(new int[]{2,7,11,5},9, "[0,1]"),
                Arguments.of(new int[]{3,2,4}, 6, "[1,2]"),
                Arguments.of(new int[]{3,3}, 6, "[0,1]")

        );
    }
}
