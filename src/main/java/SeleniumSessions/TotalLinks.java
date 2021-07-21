package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://amazon.in");

		List<WebElement> linkslist = driver.findElements(By.tagName("a"));

		// to get the total count
		System.out.println("Total count:" + linkslist.size());

		//1.  To get the text using for loop
		/*for (int i = 0; i < linkslist.size(); i++) {
			if (!(linkslist.get(i).getText().isEmpty())) {
				System.out.println("Text:" + linkslist.get(i).getText());
				System.out.println("TagName:" + linkslist.get(i).getTagName());
			}
		}*/
		
		/*//2. To get the text using for each loop
		for(WebElement e: linkslist){
			if(!e.getText().isEmpty())
			System.out.println(e.getText());
		}*/
		
		//3. To get the text using Streams
		long starttime = System.currentTimeMillis();
		linkslist.stream()
			.filter(e -> !e.getText().isEmpty())
				.forEach(e -> System.out.println(e.getText()));
		long endtime = System.currentTimeMillis();
		System.out.println("Sequential Stream Time: " + (endtime-starttime));
		
		//4.To get the text using Parallel streams
		long parallelstreamstarttime = System.currentTimeMillis();
		linkslist.
			parallelStream().
				filter(e -> !e.getText().isEmpty()).
					forEach(e -> System.out.println(e.getText()));
		long parallelstreamendtime = System.currentTimeMillis();
		System.out.println("Parallel Stream Time: " + (parallelstreamendtime-parallelstreamstarttime));
		
	}

}
