package com.sonal.testframework.DataDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 //System.setProperty("webdriver.chrome.driver","E:\\SeleniumDrivers\\chromedriver.exe");
    	 System.setProperty("webdriver.ie.driver", "E:\\SeleniumDrivers\\IEDriverServer.exe");
    	 WebDriver driver = new InternetExplorerDriver();
    	 //WebDriver driver=new ChromeDriver();
       //WebDriver driver = new FirefoxDriver();
       driver.get("http:/google.com");
    }
}
