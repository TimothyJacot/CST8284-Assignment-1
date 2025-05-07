
/**
 * FitnessTracker.java Name: Timothy Jacot 041113276 Course: CST8284 Prof:
 * Leanne Seaward Date: February 16th 2025 Assignment: Assignment 1 Files list:
 * FitnessTracker.java, FitnessTrackerTest.java, FitnessTrackerTest2.java
 * Starter code for FitnessTracker assignment.
 * 
 * @since due February 16th 2025
 * @version java 21.0.4
 * @author Timothy Jacot
 */
public class FitnessTracker {

	// TODO 1: INCLUDE YOUR ATTRIBUTES HERE. CHECK THE UML CLASS DIAGRAM TO INCLUDE
	// ALL ATTRIBUTES LISTED AND THEIR TYPES.
	private String FirstName;
	private String LastName;
	private String gender;
	private final double MALE_STEP_LENGTH = 0.8;
	private final double FEMALE_STEP_LENGTH = 0.7;
	private double DailySteps;
	private int DailyCaloriesBurnt;
	private int ActiveMinutes;
	private int DailyMaintenanceCals;
	// START CODE
	// END CODE

	// TODO 2: INCLUDE YOUR CONSTRUCTOR HERE.

	/**
	 * Purpose: no-args constructor for FitnessTracker class
	 */
	public FitnessTracker() {

	}

	/**
	 * Purpose: FitnessTracker constructor with arguments for all variables.
	 * 
	 * @param firstName            the first name of the user
	 * @param lastName             the last name of the user
	 * @param gender               the gender of the user, male or female
	 * @param dailySteps           the daily steps of user
	 * @param dailyCaloriesBurnt   the daily calories burnt by the user
	 * @param activeMinutes        the average active minutes from the user
	 * @param dailyMaintenanceCals the maintenance calorie level of the user
	 */
	public FitnessTracker(String firstName, String lastName, String gender, int dailySteps, int dailyCaloriesBurnt,
			int activeMinutes, int dailyMaintenanceCals) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
		this.gender = gender;
		this.DailySteps = dailySteps;
		this.DailyCaloriesBurnt = dailyCaloriesBurnt;
		this.ActiveMinutes = activeMinutes;
		this.DailyMaintenanceCals = dailyMaintenanceCals;
	}
	// START CODE
	// END CODE
	// TODO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS DIAGRAM TO
	// ENSURE ALL ARE COMPLETE.

	/**
	 * Purpose: Gets the FirstName of user input
	 * 
	 * @return returns first name
	 */
	public String getFirstName() {
		return FirstName;
	}

	/**
	 * Purpose: sets the first name of user input
	 * 
	 * @param firstName - first name of user
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	/**
	 * Purpose: gets the LastName of user input
	 * 
	 * @return returns last name
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * Purpose: sets the last name of user input
	 * 
	 * @param lastName - last name of user
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	/**
	 * Purpose: gets gender of user input
	 * 
	 * @return returns gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Purpose: sets gender of user input
	 * 
	 * @param gender - gender of user
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Purpose: gets daily steps of user input
	 * 
	 * @return returns DailySteps
	 */
	public double getDailySteps() {
		return DailySteps;
	}

	/**
	 * Purpose: sets the daily steps of user input
	 * 
	 * @param dailySteps - daily steps of user
	 */
	public void setDailySteps(int dailySteps) {
		DailySteps = dailySteps;
	}

	/**
	 * Purpose: get the daily calories burnt from user input
	 * 
	 * @return returns DailyCaloriesBurnt
	 */
	public double getDailyCaloriesBurnt() {
		return DailyCaloriesBurnt;
	}

	/**
	 * Purpose: sets the daily calories burnt from user input
	 * 
	 * @param dailyCaloriesBurnt - daily calories burnt by user
	 */
	public void setDailyCaloriesBurnt(int dailyCaloriesBurnt) {
		DailyCaloriesBurnt = dailyCaloriesBurnt;
	}

	/**
	 * Purpose: gets the active minutes of user input
	 * 
	 * @return returns ActiveMinutes
	 */
	public int getActiveMinutes() {
		return ActiveMinutes;
	}

	/**
	 * Purpose: sets the active minutes of user input
	 * 
	 * @param activeMinutes - active minutes of user
	 */
	public void setActiveMinutes(int activeMinutes) {
		ActiveMinutes = activeMinutes;
	}

	/**
	 * Purpose: sets the daily maintenance calories of user input
	 * 
	 * @return returns DailyMaintenanceCals
	 */
	public int getDailyMaintenanceCals() {
		return DailyMaintenanceCals;
	}

	/**
	 * Purpose: sets the daily maintenance calories of user input
	 * 
	 * @param dailyMaintenanceCals - daily maintenance calories of user
	 */
	public void setDailyMaintenanceCals(int dailyMaintenanceCals) {
		DailyMaintenanceCals = dailyMaintenanceCals;
	}

	/**
	 * Main no return method which indicates all fitness data provided by the user,
	 * including first, last name, gender, steps, level of activity, calorie surplus
	 * / deficit, etc...
	 * 
	 * @return
	 */

	// testCalulateDistance
	// if statement to determine step distance based on gender
	public double testCalculateDistance() {
		double stepsWalked = 0;
		if (gender.equalsIgnoreCase("male")) {
			stepsWalked = DailySteps * MALE_STEP_LENGTH;
			if (gender.equalsIgnoreCase("female")) {
				stepsWalked= DailySteps * FEMALE_STEP_LENGTH;
			}
		}
		return stepsWalked;
	}

	// calculateDistance method
	public String testFitnessLevel() {
		String msg;
		msg = "Weekly Active Minutes: " + ActiveMinutes * 7 + "%n";

		// if statement for fitness level depending on activity time / calorie intake
		if (ActiveMinutes * 7 > 150 && DailyCaloriesBurnt > 2000) {
			msg += "Fitness Level: Active%n";
		} else if (ActiveMinutes * 7 >= 75 && ActiveMinutes * 7 <= 150
				|| (DailyCaloriesBurnt >= 1000 && DailyCaloriesBurnt >= 2000)) {
			msg +="Fitness Level: Moderately Active%n";
		} else {
			msg +="Fitness Level: Sedentary%n";
		}
		return msg;
	}

	public double calculateCalorieDeficit() {
		double CalorieDeficit = 0;
		if (DailyMaintenanceCals < DailyCaloriesBurnt) {
			CalorieDeficit = DailyMaintenanceCals - DailyCaloriesBurnt;
		} else if (DailyMaintenanceCals > DailyCaloriesBurnt) {
			CalorieDeficit = DailyMaintenanceCals - DailyCaloriesBurnt;
		}
		return CalorieDeficit;
	}

	public void displayFitnessData() {
		// User Fitness data method
		System.out.printf("---User Fitness Data---%n");

		System.out.printf("Name: " + FirstName + " " + LastName + "%n");
		System.out.printf("Gender: " + gender + "%n");
		System.out.printf("Daily Steps: " + DailySteps + "%n");
		System.out.printf("Distance Walked: " + this.testCalculateDistance() + "%n");
		System.out.printf(this.testFitnessLevel());
		System.out.printf("Daily calorie deficit/surplus: " + this.calculateCalorieDeficit() + "%n");
		System.out.printf("Fitness Level Criteria:%n");
		System.out.println("Active: More than 150 active minutes per week and over 2000 calories burned.");
		System.out.println("Moderately Active: 75-150 active minutes per week or 1000-2000 calories burned.");
		System.out.println("Sedentary: Less than 75 active minutes per week and under 1000 calories burned.");

	}
} // end class FitnessTracker