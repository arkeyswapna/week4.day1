package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML1Asnmt2 {
	//HTML1
	// 1. Launch the URL https://html.com/tags/table/
	//2. Get the count of number of rows
	//3. Get the count of number of columns
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		// 1. Launch the URL https://html.com/tags/table/
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//2. Get the count of number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		System.out.println("No of rows are: "+rows.size());
		//3. Get the count of number of columns
		List<WebElement> col = driver.findElements(By.xpath("//table[@class='attributes-list']//th"));
		System.out.println("No of columns are: "+col.size());
		driver.getTitle();
	}

}
