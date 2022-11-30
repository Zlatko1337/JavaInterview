package hr.calzedoniadgital.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Automatic testing
		 * Step 1: Visit www.falconeri.com
		 * Step 2: Click on search button 'Cerca'
		 * Step 3: Search for product with code 'DML477C' and click on first result
		 * Step 4: Click on size 'M'
		 * Step 5: Click on add to cart button 'Aggiungi al carrello'
		 */
		
		// SOLUTION
		
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Visit www.falconeri.com
		driver.get("https://www.falconeri.com/it");

		// Close cookies dialog
		driver.findElement(By.className("onetrust-close-btn-handler")).click();
		Thread.sleep(500);

		// Click on search button 'Cerca'
		driver.findElement(By.className("search-toggler")).click();

		// Search for product with code 'DML477C' and click on first result
		driver.findElement(By.name("q")).sendKeys("DML477C");
		Thread.sleep(3000);
		driver.findElements(By.className("product")).get(0).click();

		// Click on size 'M'
		driver.findElement(By.xpath("//label[@for='M']")).click();
		Thread.sleep(3000);

		// Click on add to cart button 'Aggiungi al carrello'
		driver.findElement(By.className("add-to-cart")).click();
		Thread.sleep(3000);
		
		//Check cart
		boolean isCartEmpty = driver.findElements(By.xpath("//div[@class='card-body']//*")).size() == 0 ? true : false;
		System.out.println(isCartEmpty ? "TEST FAILED" : "TEST SUCCESS");	
		
		driver.quit();
	}

}
