package util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constant.FileName;
import constant.Key;

public class ConfigUtil {

	private Properties properties;
	
	public ConfigUtil(FileName fileName) // Filename
			//throws FileNotFoundException 
	{
//		if(fileName == null) {
//			throw new FileNotFoundException();
//		}
		initProperties(fileName.getFileNameValue());// "config.properties"
	}
	
	private void initProperties(String file) 
	{
		if(properties == null) {
			properties = new Properties();
		}
		
		try 
		{
			//properties.load(new FileReader("src/main/resources/config.properties"));
			properties.load(getClass().getClassLoader().getResourceAsStream(file));// "config.properties"
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public String getPropertyValue(Key key) 
	{
		return properties.getProperty(key.getKeyValue());
	}
}
