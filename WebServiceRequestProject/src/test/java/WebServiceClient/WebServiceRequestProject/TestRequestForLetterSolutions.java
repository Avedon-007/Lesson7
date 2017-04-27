package WebServiceClient.WebServiceRequestProject;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.aonaware.services.webservices.ArrayOfString;

public class TestRequestForLetterSolutions 
{
	@Test
	public void testRequest()
	{
		String validString = "";
		
		Request1 requestInstance = new Request1();
		
		
		requestInstance.request("testing");
		assertTrue(" ", validString.equalsIgnoreCase(requestInstance.request("testing");));
	}
}
