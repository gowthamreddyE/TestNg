package web.notification.classs;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebBasedBlockNotificatio {

	public static void main(String[] args) {
		

	}

	public static void BlockTheNotification() throws InterruptedException {

		/**this method is used for it will ask every time see the notification
		 *because of the we will give the 0 as the input 
		 *give 1 it will bve allow
		 *give 2 it will be block the notification
		 *disable-nitification meanse it will disable the all the notificatins*/


		HashMap<String, Integer> conentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();

		conentSettings.put("notifications", 2);
		conentSettings.put("geolocation", 2); 
		conentSettings.put("media_stream", 2);
		profile.put("managed_default_content_settings", conentSettings); 
		prefs.put("profile", profile);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://mictests.com/");
		Thread.sleep(6000);
		driver.findElement(By.id("mic-launcher")).click();
	}

}


