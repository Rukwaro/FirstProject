// Navigate to selenium.dev/downloads to get libraries
// Go to Selenium Client & WebDriver Language Bindings
// Click on Java Download, not Alpha Download
// Navigate down to drivers and click chrome documentation
// Confirm the version of chrome installed in your computer
// Click on the same driver version as your chrome browser
// Download chromedriver_win32.zip and go to download folder
// Extract chrome driver and selenium java
// create a lib folder in the project
// Copy all the jar files in selenium and paste them in lib
// Highlight on jars, right click, click on build path, add
// This will create a Referenced Libraries in the project
// In the code, hover on WebDiver and import WebDriver
// In the code, hover on ChromeDriver and import ChromeDriver
// Run the code for the first time and it will fail
// The path to the driver executable must be set by the webdriver.chrome.driver system property
// Create a driver folder in the project and paste chromedriver into it
// Set the path to the driver in the system properties
// To use the local variable called driver, set parameters


package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {

		// Set the webdriver.chrome.driver system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rukwaro\\Documents\\SeleniumWorkspace\\FirstProject\\driver\\chromedriver.exe");
		
		// Create a browser instance
		WebDriver driver = new ChromeDriver();
		
		// Use the driver variable to get https://www.google.com/
		driver.get("https://www.google.com/");
		
		// Maximize the https://www.google.com/ window
		driver.manage().window().maximize();
		
		// Close the https://www.google.com/ automatically
		driver.close();

	}

}
