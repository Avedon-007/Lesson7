package WebServiceClient.WebServiceRequestProject;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestRequestForMinLetterSolutions 
{
	private String testWord = "testing";
	private int lettersMinNumber = 6;
	private String validString = "setting, testing, ingest, tinges";
	
	@Test
	public void testRequestForMinLetterSolution()
	{
		Request2Minimum requestInstance = new Request2Minimum();
		assertTrue(requestInstance.request2Min(testWord, lettersMinNumber).equalsIgnoreCase(validString), "Incorect responce string");
	}
}
