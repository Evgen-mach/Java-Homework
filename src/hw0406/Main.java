// Напишите программу расчета даты следующего дня введя 3 числа - день, месяц и год
package hw0406;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day = getDay();
        int month = getMonth();
        int year = getYear();
        int newDay = getNewDay(day, month, year);
        int newMonth = getNewMonth(newDay, month);
        int newYear = getNewYear(newMonth, year);
//        calculateNextDay(day, month, year);
        printNextDay(newDay, newMonth, newYear);
    }

    public static int getDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day = scanner.nextInt();
        return day;
    }

    public static int getMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month: ");
        int month = scanner.nextInt();
        return month;
    }

    public static int getYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        return year;
    }

    public static int getNewDay(int day, int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }
        day++;

        if (day > daysInMonth[month]) {
            day = 1;
        }
        return day;
    }

    public static int getNewMonth(int day, int month) {
        if (day == 1) {
            month++;
        } else if (month > 12) {
            month = 1;
        }
        return month;
    }

    public static int getNewYear(int month, int year) {
        if (month == 1) {
            year++;
        }
        return year;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

//    public static int calculateNextDay(int day, int month, int year) {
//        int nextDay = day;
//        int nextMonth = month;
//        int nextYear = year;
//
//        nextDay = getNewDay(nextDay, nextMonth, nextYear);
//
//        if (nextDay == 1) {
//            nextMonth = getNewMonth(nextDay, nextMonth);
//            if (nextMonth == 1) {
//                nextYear++;
//            }
//        }
//
//        return nextDay;
//    }

    public static void printNextDay(int nextDay, int nextMonth, int nextYear) {
        System.out.println("The next day is: " + nextDay + " " + nextMonth + " " + nextYear);
    }
}