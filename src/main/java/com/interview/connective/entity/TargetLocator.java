package com.interview.connective.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
public final class TargetLocator {

    private final Integer[] nums;

    private final int target;
    private final Map<Node, Integer> mapOfList = new HashMap<>();


    public TargetLocator(final Integer[] nums, final int target) {
        this.nums = nums;
        this.target = target;
    }

    public String searchTarget() {

        populateToMap();

        return getTargetIndexNode();

    }

    private String getTargetIndexNode() {
        Iterator<Map.Entry<Node, Integer>> itr = mapOfList.entrySet().iterator();

        Node targetNode = null;
        while (itr.hasNext()) {
            Map.Entry<Node, Integer> entry = itr.next();

            boolean result = isMatchingTarget(entry.getKey(), entry.getValue());

            if (result) {
                targetNode = entry.getKey();
                break;
            }
        }
        System.out.println(targetNode.toString());
        return targetNode.toString();
    }

    private void populateToMap() {
        for (int i = 0; i < nums.length; i++) {

            if (i + 1 != nums.length) {
                mapOfList.put(new Node(i, i + 1, nums[i]), Integer.valueOf(nums[i + 1]));
            }
        }
    }

    private boolean isMatchingTarget(Node key, Integer endValue) {
        return Integer.compare(key.startValue + endValue, this.target) == 0;
    }

    private final class Node {
        int startIndex;
        int endIndex;
        int startValue;

        private static final String FORMAT = "[%d,%d]";

        Node(final int startIndex, final int endIndex, final int startValue) {
            this.startIndex = startIndex;
            this.startValue = startValue;
            this.endIndex = endIndex;
        }

        @Override
        public String toString() {
            return String.format(FORMAT, startIndex, endIndex);
        }
    }


}
