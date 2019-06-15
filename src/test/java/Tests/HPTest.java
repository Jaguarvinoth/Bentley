package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Basepage;
import Pages.HPObject;

public class HPTest {

	HPObject hp;
	Basepage bp;

	public HPTest() {
		hp = new HPObject();
		bp = new Basepage();
	}

	@Test
	public void verifyWomentab() {
		Assert.assertTrue(hp.getwomen().isDisplayed(),"Failed : not display");		
		Assert.assertEquals(hp.getwomen().getText(), "WOMEN");
		System.out.println(hp.getwomen().getText());
	}

	@Test
	public void verifydressestab() {
		Assert.assertTrue(hp.getdresses().isDisplayed());
	}

	@Test
	public void verifytshirttab() {
		Assert.assertTrue(hp.gettshirt().isDisplayed());
	}
	
	@Test
	public void verifysize() {
		Assert.assertTrue(hp.getsize().isDisplayed());
	}

	@Test
	public void verifysizelist()
	{
		for(WebElement e:hp.sizelist)
			Assert.assertTrue(e.isDisplayed());
	}
	
	@Test
	public void verifyaddcart() {
		Assert.assertTrue(hp.getaddcart().isDisplayed());
	}
	
	@Test
	public void verifytwitshare()
	{
		hp.driver.findElement(By.className("icon-home")).click();
		hp.getdresses().click();
		hp.driver.findElement(By.xpath("//div[@class='product-container']//a/img[1]")).click();
		Assert.assertTrue(hp.gettwit().isDisplayed());
		Assert.assertTrue(hp.getshare().isDisplayed());
	}
	
	@Test
	public void verifydescription()
	{
		Assert.assertTrue(hp.getdescription().isDisplayed());
	}
	
}
