package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Frame is other Webelement and it is part of DOM
		//F DOM is part of Main DOM
		//Same attribute and hierarchy will be available for Frame DOM also.
		//Multiple frames will be available
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo().frame(2); // frame using index and it will start with 0,1..
		
		//driver.switchTo().frame("main"); // frame using the name of the frame we can even give id of the frame
		
		driver.switchTo().frame(driver.findElement(By.name("main"))); // giving the web element
		
		//compare to the first, last two would be good to use
		//If name or id is not available ask dev to give
		
		String text = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(text);

	}

}
