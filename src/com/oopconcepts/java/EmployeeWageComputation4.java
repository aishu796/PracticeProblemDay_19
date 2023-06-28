package com.oopconcepts.java;
import java.util.Random;

public class EmployeeWageComputation4 {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int WORKING_DAYS_PER_MONTH = 20;

    private static int calculateDailyWage(int attendance) {
        int dailyWage = 0;

        switch (attendance) {
            case 1:
                dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                break;
            default:
                break;
        }

        return dailyWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();
        int totalWage = 0;

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            int attendance = random.nextInt(2);
            int dailyWage = calculateDailyWage(attendance);
            totalWage += dailyWage;
        }

        System.out.println("Total Wage for the Month: $" + totalWage);
    }
}


