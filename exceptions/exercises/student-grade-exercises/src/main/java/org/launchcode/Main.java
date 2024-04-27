package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println("Test");
        Divide(3, 0);
        Divide(3, 1);
        System.out.println("Test2");
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (HashMap.Entry<String, String> file : studentFiles.entrySet()) {
            System.out.println(file.getKey() + " scored " + CheckFileExtension(file.getValue()) + " points!");
        }
    }

    public static void Divide(int x, int y) {
        // Write code here!
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }

    public static int CheckFileExtension(String fileName) {
        // Write code here!

        if (fileName.isEmpty() || fileName.equals(null)) {
            try {
                throw new MissingAssignment("No assignment submitted.");
            } catch (MissingAssignment e) {
                e.printStackTrace();
            }
            return -1;
        } else if (fileName.contains(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}