package org.launchcode;

import org.launchcode.Student;

public class StudentPractice {
    public static void main(String[] args){
        //instantiate your org.launchcode.Student class below
        Student josh = new Student("Josh", 12345, 1, 4.0);
        System.out.println(josh.getName() + " has a " + josh.getGpa() + " GPA");
        Teacher historyTeacher = new Teacher("Nic", "Seltzer", "Java", 2);
    }
}
