import java.util.Scanner;

/**
 * Name: Sailesh
 * Period: 3
 * Date Last Revised: 11/17/26
 * Unit 3 - The Birthday Project
 * 
 * Program Description: We are tasked to make a program
 * to find the exact days away the users birthday is and what specific day it is on.
 * 
 */
public class Birthday {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    }
    
    public static void printIntroduction() {
    	System.out.print("This program tells you how many days it will be until your next birthday.");
    }
    
    public static int getMonth(Scanner input) {
    	System.out.print("What is the month (1-12)?");
    		int month = input.nextInt();
    	
    	return month;
    }
    
    public static int getDay(Scanner input, int month) {
    	int maxDay = daysInMonth(month);
    	System.out.printf("What is the day   (1-%d)?",maxDay);
    	int Day = input.nextInt();
    	
    	return Day;
    }
    
    public static int daysInMonth(int month) {
    	if(month == 10 || month == 1 || month == 3 || month == 5 || 
    			month == 7 || month == 8 || month == 12) {
    		return 31;
    	}
    	if(month == 9 || month == 6 || month == 4 || month == 11) {
    		return 30;
    	}
    	if(month == 2) {
    		return 28;
    	}
    	
    public static int absoluteDay(int month, int day) {
    	int sum = 0;
    	for(int i = 1; i < month; i++) {
    		sum += daysInMonth(i);
    	}
    	sum += day
    	System.out.printf("%d/%d is the day #%d of 365%n", month, day, sum);
    	return sum;
    }
    public static void printNextBirthday(int absToday, int absBirth) {    	
    if(absToday == absBirth) {
    	System.out.println("Happy birthday!");
    }
    if(absToday == absBirth - 1) {
    	System.out.println("Wow, your birthday is tomorrow!");
    }
    else {
    	System.out.printf("Your next birthday is in %d days.%n", absBirth - absToday);
    }
    
    }
