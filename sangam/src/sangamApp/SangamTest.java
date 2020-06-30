package sangamApp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SangamTest extends SangamBase{
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(20000);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@text='Lets Begin ']")).click();
		Thread.sleep(4000);
		AndroidElement Date_Error_msg = driver.findElement(By.xpath("//*[@text='Please specify Date of Birth']"));
		Assert.assertEquals("Date_Error_msg", "Date_Error_msg","please enter date");
		Thread.sleep(2000);
		AndroidElement Community_Error_msg = driver.findElement(By.xpath("//*[contains(@text,'Please specify Caste / Community')]"));
		Assert.assertEquals("Community_Error_msg", "Community_Error_msg","please select community");
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@text='Create Profile for']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@text='Self ']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@text='Male']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//*[@class='android.widget.EditText'])[1]").sendKeys("1");
		Thread.sleep(2000);
		driver.findElementByXPath("(//*[@class='android.widget.EditText'])[2]").sendKeys("0");
		Thread.sleep(2000);
		driver.findElementByXPath("(//*[@class='android.widget.EditText'])[3]").sendKeys("0");
		Thread.sleep(2000);
		driver.findElementByXPath("(//*[@class='android.widget.EditText'])[4]").sendKeys("9");
		Thread.sleep(2000);
		driver.findElementByXPath("(//*[@class='android.widget.EditText'])[5]").sendKeys("1");
		Thread.sleep(2000);
		driver.findElementByXPath("(//*[@class='android.widget.EditText'])[6]").sendKeys("9");
		Thread.sleep(2000);
		driver.findElementByXPath("(//*[@class='android.widget.EditText'])[7]").sendKeys("9");
		Thread.sleep(2000);
		driver.findElementByXPath("(//*[@class='android.widget.EditText'])[8]").sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@text,'Mother Tongue')]")).click();
		Thread.sleep(4000);
		driver.findElementByXPath("(//*[@class='android.widget.EditText'])").sendKeys("Marathi");
		Thread.sleep(2000);
		driver.findElementByXPath("(//*[@text='Marathi '])").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//*[contains(@text,'Community Eg. Brahmin ')]").click();
		Thread.sleep(4000);
		driver.findElementByXPath("(//*[@class='android.widget.EditText'])").sendKeys("Devanga");
		Thread.sleep(2000);
		driver.findElementByXPath("(//*[@text='Hindu - Devanga '])").click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@text='Lets Begin ']")).click();
		Thread.sleep(2000);
		AndroidElement Email_Textbox = driver.findElement(By.xpath("//*[@text='Email']"));
		Assert.assertEquals("Email_Textbox", "Email_Textbox","please enter email");
	}

}
