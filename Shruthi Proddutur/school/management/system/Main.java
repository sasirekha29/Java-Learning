package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher bharat = new Teacher(1,"bharat",10000, "math");
        Teacher rani = new Teacher(2, "rani", 7000,"social");
        Teacher shruthi = new Teacher(3, "shruthi", 10000,"English");

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(bharat);
        teacherList.add(rani);
        teacherList.add(shruthi);

        student amara = new student(150030101, "amara", 7, 8);
        student akash = new student(150030102, "akash", 6,8);

        List<student> studentList = new ArrayList<>();
        studentList.add(amara);
        studentList.add(akash);

        School dps = new School(teacherList, studentList);
        amara.payFees(5000);
        akash.payFees(10000);

        System.out.println("DPS has earned ₹"+ dps.getTotalMoneyEarned());
        System.out.println("Making the school pay salary to teacher!!");
        shruthi.receiveSalary(shruthi.getSalary());
        System.out.println("DPS has spent for salary to "+ shruthi.getName() + " and now it has "
        +dps.getTotalMoneyEarned());
    }
}


















