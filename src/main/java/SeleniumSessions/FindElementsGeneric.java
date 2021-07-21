package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsGeneric {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://amazon.in");

		By images = By.tagName("img");
		By links = By.tagName("a");

		System.out.println("Links Count:" + doGetLinksCount(links));

		List<String> linktext = getLinksTextList(links);
		System.out.println(linktext);
		if (linktext.contains("Become an Affiliate")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		getAttributesTextList(images, "src").stream().forEach(e -> System.out.println(e));

	}

	public static List<WebElement> doGetElements(By locator) {
		return driver.findElements(locator);
	}

	public static int doGetLinksCount(By locator) {
		return getLinksTextList(locator).size();
	}

	public static List<String> getLinksTextList(By locator) {
		List<WebElement> list = doGetElements(locator);
		List<String> textlist = new ArrayList<String>();
		for (WebElement e : list) {
			if (!e.getText().isEmpty()) {
				String textval = e.getText();
				textlist.add(textval);
			}
		}
		return textlist;
	}

	public static List<String> getAttributesTextList(By locator, String attributename) {
		List<WebElement> list = doGetElements(locator);
		List<String> attributetextlist = new ArrayList<String>();
		for (WebElement e : list) {
			String attval = e.getAttribute(attributename);
			attributetextlist.add(attval);
		}
		return attributetextlist;
	}

}
