package WebServiceClient.WebServiceRequestProject;

import com.aonaware.services.webservices.ArrayOfString;
import com.aonaware.services.webservices.CountCheatService;
import com.aonaware.services.webservices.CountCheatServiceSoap;

public class Request1 
{
	public static void main(String[] args) 
	{
		//call the webservice
		//using WSDL
		
		CountCheatServiceSoap webservice = new CountCheatService().getCountCheatServiceSoap();
		
		String anagram = "testing";
		ArrayOfString letterSolutions = webservice.letterSolutions(anagram);	
		
		//System.out.println(letterSolutions.getString());				
	}
}
