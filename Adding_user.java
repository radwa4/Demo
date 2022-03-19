/*there are different ways ti enter empoyee name we can read them from excel i select easy way 
i notice list of employes define in jquery script */
package Task3;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Adding_user {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radwa\\Documents\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");

		//Enter user name for website
		WebElement element = driver.findElement(By.name("txtUsername"));
		element.sendKeys("Admin");
		//Add user name for website

		WebElement element2 = driver.findElement(By.name("txtPassword"));
		element2.sendKeys("admin123");
		// click on login button
		driver.findElement(By.id("btnLogin")).click();
		// go to menu Admin > User Management > user
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("btnAdd")).click();

		//Add info for user
		//Add name of employee
		WebElement element3 = driver.findElement(By.id("systemUser_employeeName_empName"));
		element3.sendKeys("David Morris");
		//Add user name of employee

		WebElement element4 = driver.findElement(By.id("systemUser_userName"));
		element4.sendKeys("example2");

		//Add password of employee
		WebElement element5 = driver.findElement(By.id("systemUser_password"));
		element5.sendKeys("P@ssw0rd");

		//Add  confirmed password of employee
		WebElement element6 = driver.findElement(By.id("systemUser_confirmPassword"));
		element6.sendKeys("P@ssw0rd");
		// click on save button
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(7000);
		// check entered data
		//search by username 
		 WebElement element7 = driver.findElement(By.id("searchSystemUser_userName"));
		element7.sendKeys("example22");
		//search by employee
		WebElement element8 = driver.findElement(By.id("searchSystemUser_employeeName_empName"));
		element8.sendKeys("David Morris");
		//click on search button
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(7000);

		// enter to selected uer
		WebElement element9 = driver.findElement(By.xpath("*//*[@class='odd']/td[2]/a"));
		element9.click();
		// Validate entered date
		String employeename=element3.getAttribute("default Value");
		String username=element4.getAttribute("default Value");
		Assert.assertEquals(employeename,"David Morris");
		Assert.assertEquals(username,"example22");



	}






}






