package genericPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Worklib extends BaseTest{

	public void handleFramebyIndex(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void handleFramebyFrameElement(WebElement FrameElement)
	{
		driver.switchTo().frame(FrameElement);
	}
	
	public void handleFrameByNameorId(String name)
	{
	driver.switchTo().frame(name);
	}
	
	public void rightClick(WebElement target)
	{
	Actions	act=new Actions(driver);
	act.contextClick().perform();
	}
	
	public void dragAndDrop(WebElement target,WebElement src)
	{
	Actions	act=new Actions(driver);
	act.dragAndDrop(src, src).perform();
	}
	
	}


