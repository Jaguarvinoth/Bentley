package Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HPObject extends Basepage {
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[1]//a[@class='sf-with-ul']")
	private WebElement women;

	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]//a[@class='sf-with-ul']")
	private WebElement dresses;

	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a[@title='T-shirts']")
	private WebElement tshirt;

	@FindBy(xpath = "//li/ul//a[@title='T-shirts']")
	private WebElement subtshirt;

	@FindBy(xpath = "//a[text()='S']")
	private WebElement size;

	@FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_1']")
	public ArrayList<WebElement> sizelist;

	@FindBy(xpath = "//a[@data-id-product='3']/span[text()='Add to cart']")
	private WebElement addcart;

	@FindBy(xpath = "//dt[@data-id='cart_block_product_3_13_0'")
	private WebElement verifyaddcart;

	@FindBy(className = "icon-twitter")
	private WebElement twit;

	@FindBy(className = "icon-facebook")
	private WebElement share;

	@FindBy(id = "short_description_content")
	private WebElement description;

	public HPObject() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getwomen() {
		return women;
	}

	public WebElement getdresses() {
		return dresses;
	}

	public WebElement gettshirt() {
		return tshirt;
	}

	public WebElement getsubtshirt() {
		return subtshirt;
	}

	public WebElement getsize() {
		dresses.click();
		return size;
	}

	public WebElement getaddcart() {
		addcart.click();
		driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
		;
		return verifyaddcart;
	}

	public WebElement gettwit() {
		return twit;
	}

	public WebElement getshare() {
		return share;
	}

	public WebElement getdescription() {
		return description;
	}

}
