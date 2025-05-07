import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FitnessTrackerTest2 {
	
	private static final double EPSILON = 1E-12;

	@Test
	public void testCalculateDistance() {
		FitnessTracker test1 = new FitnessTracker();
		test1.setDailySteps(10000);
		test1.setGender("female");
		test1.testCalculateDistance();
		double DistanceResults = test1.getDailySteps();
		double expectedResult = 8000.0;
		Assert.assertEquals(DistanceResults, expectedResult, EPSILON);
	}
}
