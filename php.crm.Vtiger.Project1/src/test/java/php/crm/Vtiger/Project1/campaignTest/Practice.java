package php.crm.Vtiger.Project1.campaignTest;

import java.util.Date;

import org.testng.annotations.Test;

public class Practice {

	@Test 
	public void b() {
	
		Date date = new Date();
		System.out.println(date.getDate());
		
		System.out.println(date.getMonth()+1);
		String year = date.getYear()+"";
		System.out.println(year.substring(1, 3));
		
		System.out.println("Demo Print");

		System.out.println("Local Change");
		System.out.println("Demo Print");
		System.out.println("Global Change");
		System.out.println("Global Change1");
		System.out.println("Global Change1");





		
		
	}
	
}
