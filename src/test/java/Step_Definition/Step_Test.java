package Step_Definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Test {

WebDriver driver=new ChromeDriver();
	
	public void browser() {
		System.out.println(" I am inside the browser");}

	@Given("Launch the browser")
	public void launch_the_browser() {
		System.out.println("inside the step launch the browser");
	}
	
	public void teardown() {

		driver.close();}
	

	@When("user open the url {string}")
	public void user_open_the_url(String string) {

		driver.get("https://www.limeroad.com/");
//driver.findElement(By.xpath("//body/div[@id='vSt']/main[@id='views']/div[1]/div[1]/div[1]/div[1]\r\n"));
	}

	@When("click on shop men")
	public void click_on_shop_men() {
		System.out.println("click on shop men");
	}

	@Then("user should see the products displayed for men")
	public void user_should_see_the_products_displayed_for_men() {
		System.out.println("user should find products foe men displayed");
	}



}

	
	
	
	

