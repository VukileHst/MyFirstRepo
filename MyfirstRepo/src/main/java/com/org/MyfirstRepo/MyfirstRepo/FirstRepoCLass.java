package com.org.MyfirstRepo.MyfirstRepo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstRepoCLass {

	public static void main(String[] args) {
		WebDriver driver;
		
		// TODO Auto-generated method stub
		System.out.println("Messages");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Create an instance of ChromeDriver to execute our tests
		driver = new ChromeDriver();
		
		String baseUrl = "http:demo.guru99.com/";
		String expectedTitle = "Demo Site";
		String actualTitle = "";
		
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("passed  ");
			System.out.println(actualTitle);
		}
		else {
			System.out.println("failed");
			System.out.println(actualTitle);
		}
	}

}
