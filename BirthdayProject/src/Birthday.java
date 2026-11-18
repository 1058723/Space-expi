import java.util.Scanner;

/**
 * Name: Sailesh
 * Period: 3
 * Date Last Revised: 11/17/26
 * Unit 3 - The Birthday Project
 * 
 * Program Description:
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
    	if(month == )
    	
    	return 0;
    }
    
    public static int absoluteDay(int month, int day) {
    	return 0;
    }
    
    public static void printNextBirthday(int absToday, int absBirth) {
    	
    }
}
