package WebServiceClient.WebServiceRequestProject;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;


public class TestRequestForLetterSolutions 
{
	private String testWord = "testing";
	private String validString = "setting, testing, ingest, tinges, gents, gites, inset, singe, stein, sting, "
			+ "stint, tents, tines, tinge, tings, tints, gens, gent, gets, gins, gist, gite, gits, nest, "
			+ "nets, nett, nits, sent, sett, sign, sine, sing, site, tens, tent, test, ties, tine, ting, tins, tint, tits";

	@Test
	public void testRequest() 
	{
		Request1 requestInstance = new Request1();
		assertTrue((requestInstance.request(testWord)).equalsIgnoreCase(validString), "Incorect responce string");
	}
}
