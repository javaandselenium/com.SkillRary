package com.SkillRary.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author Bharani
 *
 */

public class Propertylib implements AutoConstant {
	/**
	 * To read the data from the propertyfile
	 * 
	 * @param Key
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static String getpropertydata(String Key) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileInputStream(propertyfilepath));
		String value1 = p.getProperty(Key);
		return value1;
	}

}
