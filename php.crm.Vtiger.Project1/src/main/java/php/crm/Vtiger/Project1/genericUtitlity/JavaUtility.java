package php.crm.Vtiger.Project1.genericUtitlity;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
/**
 * 
 * @author amit
 *
 */

public class JavaUtility {
	/**
	 * this is method  to return Random number
	 * @param limit
	 * @return
	 */
	
	public int generateRandomNumber(int limit) {
		Random random=new Random();
		return random.nextInt(limit);
	}
	
	/**
	 * to genrate system Date And Time
	 * @return
	 */
	public String generateSystemDateTime() {
		return new Date().toString();
	}
	
	
	public String fetchDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream(IPathConstant.PROPERTY_PATH);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

}
