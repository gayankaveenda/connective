package com.interview.connective.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Container {

    private Integer[] height;

    private int output;

    public Container(Integer[] height) {
        this.height = height;
    }

    public int calculateMaxAreaOfWater() {
        for (int i = 0; i < height.length; i++) {

            for (int j = i + 1; j < height.length; j++) {

                int area = height[i] > height[j] ? (height[j] * (j - i)) : (height[i] * (j - i));
                output = area > output ? area : output;
            }
        }
        return output;
    }

    @Override
    public String toString() {
        return "Output : " + output;
    }
}
