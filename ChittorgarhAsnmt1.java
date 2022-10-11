package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChittorgarhAsnmt1 {
	//Chittorgarh:
	// 1. Launch the URL https://www.chittorgarh.com/
	//2. Click on stock market
	//3. Click on NSE bulk Deals
	//4. Get all the Security names
	//5. Ensure whether there are duplicate Security names
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		// 1. Launch the URL https://www.chittorgarh.com/
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//2. Click on stock market
		driver.findElement(By.xpath("//a[@class='ch-bar-item ch-button']//following::a[@id='navbtn_stockmarket']")).click();
		//3. Click on NSE bulk Deals
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr//td[3]"));
		System.out.println(findElements.size());
		//4. Get all the Security names
		List<String> s=new ArrayList<String>();
		for (WebElement each : findElements) {
			s.add(each.getText());

		}
		System.out.println(s);
		//5. Ensure whether there are duplicate Security names
		Set<String> set=new LinkedHashSet<String>(s);
		System.out.println(set.size());
		System.out.println(set);
		System.out.println(driver.getTitle());
	}

}
