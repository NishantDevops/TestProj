package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class addbook {
  @Test
  public void verifyTitle() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\DevOps\\workspace\\webapp-addbook\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co");
		String title= driver.getTitle();
		System.out.println("Page title is "+title);
		driver.close();
  }
}
