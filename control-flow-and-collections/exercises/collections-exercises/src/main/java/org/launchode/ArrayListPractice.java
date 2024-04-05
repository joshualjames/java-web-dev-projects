package org.launchode;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
    }
    public static int sumEven (ArrayList < Integer > arr) {
        ArrayList<Integer> numbersArray = new ArrayList<>();
        numbersArray.add(1);
        numbersArray.add(2);
        numbersArray.add(7);
        numbersArray.add(8);
        int total = 0;
        for (int integer : numbersArray) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}

