package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	WebDriver driver;
	@Given("user opens signup page in newtour application")
	public void user_opens_signup_page_in_newtour_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		WebElement se=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a"));
		se.click();

	    
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
		WebElement uname=driver.findElement(By.id("userName"));
		uname.sendKeys(username);
	    
	}

	@When("user enters firstname as {string}")
	public void user_enters_firstname_as(String firstname) {
		WebElement fname=driver.findElement(By.id("firstName"));
		fname.sendKeys(firstname);
	    
		
	  
	}

	@When("user enters lastname as {string}")
	public void user_enters_lastname_as(String lastname) {
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys(lastname);
	    
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String password) {
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys(password);
	    
	    
	}

	@When("user enters confirmpassword as {string}")
	public void user_enters_confirmpassword_as(String confirmpassword) {
		WebElement cpass=driver.findElement(By.id("pass_confirmation"));
		cpass.sendKeys(confirmpassword);
	   
	}

	@When("user selects gender as {string}")
	public void user_selects_gender_as(String gender) {
		WebElement gen=driver.findElement(By.id("gender"));
		gen.click();
	
	   
	}

	@When("user enters email as {string}")
	public void user_enters_email_as(String email) {
		WebElement mail=driver.findElement(By.id("emailAddress"));
		mail.sendKeys(email);
	   
	}

	@When("user enters mobno as {string}")
	public void user_enters_mobno_as(String mobno) {
		WebElement mob=driver.findElement(By.id("mobileNumber"));
		mob.sendKeys(mobno);
	   
	}

	@When("user enters dob as {string}")
	public void user_enters_dob_as(String dob) {
		WebElement dat=driver.findElement(By.id("dob"));
		dat.sendKeys(dob);
	   
	}

	@When("user enters address as {string}")
	public void user_enters_address_as(String address) {
		WebElement addr=driver.findElement(By.id("address"));
		addr.sendKeys(address);
	   
		
	    
	}

	/*@When("user enters sq as {string}")
	public void user_enters_sq_as(String sq) {
		WebElement ques=driver.findElement(By.id("securityQuestion")); */
		
	   
	   
	

	@When("user enters answer as {string}")
	public void user_enters_answer_as(String answer) {
		WebElement ans=driver.findElement(By.id("answer"));
		ans.sendKeys(answer);
	   
	    
	}

	@Then("click register button")
	public void click_register_button() {
		WebElement sube=driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]"));
		sube.click();
	   
	   
	}



}
