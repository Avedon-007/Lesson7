package WebServiceClient.WebServiceRequestProject;


import com.aonaware.services.webservices.ArrayOfString;
import com.aonaware.services.webservices.CountCheatService;
import com.aonaware.services.webservices.CountCheatServiceSoap;

public class Request1 
{			
	public String request(String testWord)
	{
		//call the webservice
		//using WSDL		
		CountCheatServiceSoap webservice = new CountCheatService().getCountCheatServiceSoap();				
		
		ArrayOfString letterSolutions = webservice.letterSolutions(testWord);			
		
		StringBuilder sb = new StringBuilder();
		for(String s: letterSolutions.getString()) {
			sb.append(s).append(", ");
			}
		
		sb.deleteCharAt(sb.length()-1); //delete last space
		sb.deleteCharAt(sb.length()-1); //delete last comma
				
		return sb.toString();
	}
}
