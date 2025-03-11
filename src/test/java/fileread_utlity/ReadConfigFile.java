package fileread_utlity;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class ReadConfigFile {
	Properties pro;
	
	public ReadConfigFile()
	{
		// Copy path of config file . Go to "Configuration" package-> Right click 0n config.properties  -->Properties-->Copy path
		File f1=new File("C:\\SeleniumWorkspace\\SauceDemo_Hybrid\\Configuration\\config.properties");
		try
		{
			FileInputStream fs=new FileInputStream(f1);
			pro= new Properties();
			pro.load(fs);
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public String geturl()
	{
		return pro.getProperty("base_url");
	}
	
	public String user_name()
	{
		return pro.getProperty("user");
	}
	

	public String pass_word()
	{
		return pro.getProperty("pwd");
	}

}
