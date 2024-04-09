package org.launchode;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        int total = 0;
        for (int integer : nums) {
            if (integer % 2 == 0) {
                total += integer;
                System.out.println(total);
            }
        }
    }
}


