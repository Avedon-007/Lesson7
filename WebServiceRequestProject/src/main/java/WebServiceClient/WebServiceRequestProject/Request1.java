package WebServiceClient.WebServiceRequestProject;

import java.util.List;
import java.util.StringJoiner;

import com.aonaware.services.webservices.ArrayOfString;
import com.aonaware.services.webservices.CountCheatService;
import com.aonaware.services.webservices.CountCheatServiceSoap;

public class Request1 
{
	
	public static void main(String[] args) 	
	//public String request(String testWord)
	{
		//call the webservice
		//using WSDL
		
		CountCheatServiceSoap webservice = new CountCheatService().getCountCheatServiceSoap();
		
		String anagram = "testing";
		//String anagram = testWord;
		
		ArrayOfString letterSolutions = webservice.letterSolutions(anagram);	
		
		System.out.println(letterSolutions.getString());	
		//String anagram1 = letterSolutions.getString();
		//System.out.println(anagram1);
		//return anagram1;
		
		
		
		 

		StringBuilder sb = new StringBuilder();

		for(String s: letterSolutions.getString()) {
		   sb.append(s).append(", ");
		}

		sb.deleteCharAt(sb.length()-1); //delete last space
		sb.deleteCharAt(sb.length()-1); //delete last comma
		String newString = sb.toString();
		System.out.println(newString);
	}
}
