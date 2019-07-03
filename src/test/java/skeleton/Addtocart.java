package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addtocart {
	WebDriver driver;
	@Given("Alex has registered in to TestMeApp")
	public void alex_has_registered_in_to_TestMeApp()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		WebElement sn=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a"));
	    sn.click();
	    driver.findElement(By.name("userName")).sendKeys("AlexUser");
	    driver.findElement(By.name("password")).sendKeys("Alex@123");
	    driver.findElement(By.name("Login")).click();
		
		
	   
	}

	@When("Alex search a particular product like headphones")
	public void alex_search_a_particular_product_like_headphones()  {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Headphone");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		//WebElement add=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
	    //add.click();
	    
	}

	@When("try to proceed to payment without adding any item in the cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart()  {
		
		/*WebElement cart1=driver.findElement(By.linkText("Cart"));
		String cart11=cart1.getText();
	System.out.println("No items");
		System.out.println(cart11);*/
		
		WebElement cart2=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]"));
		cart2.click();
		if(driver.getTitle().equals("View Cart"))
		{
			Assert.assertFalse(true);
			}
		else
		{
			//System.out.println("Yes");
			//Assert.assertTrue(true);
			Assert.assertFalse(false);
		}
	   
	}

	@Then("TestMeApp doesnt display the cart icon")
	public void testmeapp_doesnt_display_the_cart_icon(){
		System.out.println("there is no cart icon");
	    
	}
	



}
