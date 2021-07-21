package SeleniumSessions;

import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Broswername = "Chrome";

		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initdriver(Broswername);
		br.launchUrl("https://www.amazon.com");

		String title = br.getTitle();
		System.out.println(title);
		br.getCurrentURL();
		//br.closeBrowser();
		br.quit();

	}

}
