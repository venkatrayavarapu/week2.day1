package week2.day2.assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {

	public static void main(String[] args) {
//		1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
//		 2. Enter UserName and Password 
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		 3. Click on Login Button 
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement crmLink = driver.findElement(By.linkText("CRM/SFA"));
		if (crmLink.isEnabled()) {
			System.out.println("Login to leaftaps is successful");
			// 4. Click on CRM/SFA Link
			crmLink.click();
			WebElement leadsMenuItem = driver.findElement(By.linkText("Leads"));
			if (leadsMenuItem.isDisplayed()) {
				System.out.println("Navigates succesfully into CRM/SFA Main page");
//				 5. Click on Leads Button
				leadsMenuItem.click();
//				 6. Click on create Lead Button
				driver.findElement(By.linkText("Create Lead")).click();
				WebElement createLeadPanelHeader = driver.findElement(By.id("sectionHeaderTitle_leads"));
				if (createLeadPanelHeader.isDisplayed()) {
					System.out.println("Create lead form has loaded succesfully");
//					 7. Enter all the text fields in CreateLead page
					driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
//		               1. Do not work on Parent Account Field
					// driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("10368");
					WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
					firstName.sendKeys("Venkat");
					driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rayavarapu");
					driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Venkat");
					driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Rayavarapu");
					driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MyTitle");
					driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("1/1/2015");
					driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("MyProfile");
					driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("77805");
					driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");
					driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("7756432");
					driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("TLF");
					driver.findElement(By.id("createLeadForm_description"))
							.sendKeys("Filling profile details as per the form");
					driver.findElement(By.id("createLeadForm_importantNote"))
							.sendKeys("Company name, FirstName and Last name are madatory fields please fill properly");
					WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
					countryCode.clear();
					countryCode.sendKeys("1905");
					driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("08592");
					driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("234567");
					driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("1920");
					driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("ConnectToVenkat");
					driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("venkat.rayavarapu@gmail.com");
					driver.findElement(By.id("createLeadForm_primaryWebUrl"))
							.sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm");

//					 9. Enter all the text fields in primary address

//					 10. Get the Firstname and print it
					String valueOfFirstName = firstName.getAttribute("value");
					System.out.println("First Name : " + valueOfFirstName);
					driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Venkat");
					driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Venkat Rayavarapu");
					driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("4th Avanue");
					driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("TechnoPark SEZ");
					driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Taxas");
					driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("603002");
					driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("1");
					driver.findElement(By.name("submitButton")).click();
					WebElement errorMsg = driver.findElement(By.className("errorMessage"));
//					 12. Get and Verify the Title of the resulting Page(View Lead)
					if (driver.getTitle().contentEquals("View Lead")) {
						System.err.println("Create Lead form filled successfully");
					} else {
						System.out.println("Form not saved due to " + errorMsg.getText());
					}
				} else {
					System.out.println("Create lead form not loaded");
				}
			} else {
				System.out.println("Navigation is not  succesful into CRM/SFA Main page");
			}

		} else {
			System.out.println("Login faild");
		}
		driver.close();
	}
}
