package CDAC;




import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webDriver.gecko.driver","C:\\Users\\pdeshpande\\OneDrive - Rockwell Automation, Inc\\Desktop\\Sele\\geckodriver.exe");
WebDriver d= new FirefoxDriver();
d.get("https://www.google.com");
//org.openqa.selenium.Dimension size = d.manage().window().getSize();
//System.out.println(d.manage().window().getSize());

d.manage().window().setSize(new Dimension(400,200));
Thread.sleep(4000);
Dimension d2=d.manage().window().getSize();
System.out.println(d2);
//d.manage().window().maximize();
//d.manage().window().minimize();
//d.manage().window().maximize();

	/*
 * ChromeOptions co= new ChromeOptions(); co.setBrowserVersion("119"); //co.
 * setBinary("C:\\Users\\pdeshpande\\OneDrive - Rockwell Automation, Inc\\Desktop\\chrome-win32\\chrome.exe"
 * ); WebDriver wd=new ChromeDriver(co); //wd.get("https://www.google.com");
 * wd.get("https://demo.guru99.com/v4/");
 * //wd.get("https://test.cloud.plex.com/login?returnUrl=%2f");
 * wd.manage().window().maximize(); System.out.println(wd.getCurrentUrl());
 * System.out.println(wd.getTitle());
 */
		//wd.findElement(By.name("q")).sendKeys("Testing");
}
}