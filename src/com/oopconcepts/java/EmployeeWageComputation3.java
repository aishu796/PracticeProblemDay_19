package com.oopconcepts.java;

import java.util.Random;

public class EmployeeWageComputation3 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");


        Random random = new Random();
        int attendance = random.nextInt(2);

        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage = 0;

        switch (attendance) {
            case 1:
                dailyWage = wagePerHour * fullDayHour;
                System.out.println("Employee is Present");
                System.out.println("Daily Wage: $" + dailyWage);
                break;
            default:
                System.out.println("Employee is Absent");
        }
    }
}
