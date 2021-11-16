package browinterac;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrolaunch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		wd.manage().deleteAllCookies();
		wd.manage().window().maximize();
		wd.get("https://www.fb.com");
		
		System.out.println("Page title is: "+wd.getTitle());
		System.out.println("No. of links in page is: "+wd.findElements(By.tagName("li")).size());
		
		wd.findElement(By.linkText("Create New Account")).click();
		System.out.println(wd.findElement(By.xpath("//div[text()='Sign Up']")).getText());
		wd.quit();

	}

}
