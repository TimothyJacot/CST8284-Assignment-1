/**
 * FitnessTrackerTest.java
 * Name: Timothy Jacot 041113276
 * Course: CST8284
 * Prof: Leanne Seaward
 * Date: February 16th 2025
 * Assignment: Assignment 1
 * Files list: FitnessTracker.java, FitnessTrackerTest.java, FitnessTrackerTest2.java
 * This is the main method of the FitnessTrackerTest assignment, using Scanner to input and assign values
 * to the variables created in the FitnessTracker class.
 * @since due February 16th 2025
 * @version java 21.0.4
 * @author Timothy Jacot
 */
import java.util.Scanner;


public class FitnessTrackerTest {
/**
 * Purpose: This is the main method of the FitnessTracker program. This method will use the Scanner API
 * to assign values to all variables indicated in the FitnessTracker class file. It is prompting the user to input
 * data, which will be stored and used later on in the code. We then use the tracker.displayFitnessData method
 * to display all data that has been requested.
 * @param args args of String array
 */
	public static void main(String[] args) {
		FitnessTracker tracker = new FitnessTracker();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		tracker.setFirstName(keyboard.next());
		System.out.println("Enter last name: ");
		tracker.setLastName(keyboard.next());
		System.out.println("Enter gender (male/female): ");
		tracker.setGender(keyboard.next());
		System.out.println("Enter daily steps: ");
		tracker.setDailySteps(keyboard.nextInt());
		System.out.println("Enter daily calories burnt:");
		tracker.setDailyCaloriesBurnt(keyboard.nextInt());
		System.out.println("Enter daily active minutes: ");
		tracker.setActiveMinutes(keyboard.nextInt());
		System.out.println("Enter daily maintenance calories: ");
		tracker.setDailyMaintenanceCals(keyboard.nextInt());
	
		tracker.displayFitnessData();
		keyboard.close();
	}
	
}
