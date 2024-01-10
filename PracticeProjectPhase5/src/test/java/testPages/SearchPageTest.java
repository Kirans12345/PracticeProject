package testPages;


import org.testng.annotations.Test;

import pages.BaseClass;
import pages.SearchPage;

public class SearchPageTest extends BaseClass{

	SearchPage sp=new SearchPage();

	@Test
	public void sarchPageTest() throws InterruptedException {
		openBrowser("Chrome");

		sp.searchAll();
	}

}
