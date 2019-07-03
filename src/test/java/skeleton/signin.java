package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class signin {
	WebDriver driver;
	@Given("User open Signin page")
	public void user_open_Signin_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		WebElement sn=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a"));
	    sn.click();
	}

	@When("User enters uname as {string}")
	public void user_enters_uname_as(String uname) {
		WebElement unam=driver.findElement(By.id("userName"));
		unam.sendKeys(uname);
	    
	}

	@When("User enters pwd as {string}")
	public void user_enters_pwd_as(String pwd) {
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys(pwd);
	    
	}

	@When("Click login")
	public void click_login() {
		
		WebElement login=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]"));
		login.click();
		
	  
	}



}
