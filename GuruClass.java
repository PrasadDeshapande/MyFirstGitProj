package CDAC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdeshpande\\Downloads\\Selenium JAR\\web driver\\chromedriver.exe");
	      WebDriver dr= new ChromeDriver();
	      dr.get("https://demo.guru99.com/v4/");
	}

}
