package WebServiceClient.WebServiceRequestProject;

import com.aonaware.services.webservices.ArrayOfString;
import com.aonaware.services.webservices.CountCheatService;
import com.aonaware.services.webservices.CountCheatServiceSoap;

public class Request2Minimum 
{
	//public static void main(String[] args)
	public String request2Min(String testWord, int minNumberLetters)
	{
		//call the webservice
		//using WSDL
		CountCheatServiceSoap webservice = new CountCheatService().getCountCheatServiceSoap();	
		ArrayOfString letterSolutionsMin = webservice.letterSolutionsMin(testWord, minNumberLetters);
		//ArrayOfString letterSolutionsMin = webservice.letterSolutionsMin("testing", 6);
		
		StringBuilder sb = new StringBuilder();
		for(String s:letterSolutionsMin.getString())
		{
			sb.append(s).append(", ");
		}
		
		sb.deleteCharAt(sb.length()-1); //delete last space
		sb.deleteCharAt(sb.length()-1); //delete last comma		
		
		//System.out.println(sb);
		
		return sb.toString();
	}
}
