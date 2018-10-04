package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class L1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		long loadstart = System.currentTimeMillis();
		driver.get("https://www.phptravels.net/");
		long loadstop = System.currentTimeMillis();
		long totaload = loadstop-loadstart;
		System.out.println("The site loaded in: " +totaload );

	}

}
