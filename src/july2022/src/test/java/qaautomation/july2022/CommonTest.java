package qaautomation.july2022;

import org.testng.annotations.Test;

import qaautomation.july2022.pages.CommonPage;

public class CommonTest extends BaseWebTest {
	
	CommonPage commonpage = new CommonPage(driver, explicitWait);
	
	
	@Test
	public void testSwitching() {
		commonpage.openURL("https://the-internet.herokuapp.com/login");
		commonpage.openNewTab();
		commonpage.switchWindow(1);
		commonpage.openURL("https://facebook.com/");
		commonpage.openNewWindow();
		commonpage.openURL("https://twitter.com/");

	}

}
