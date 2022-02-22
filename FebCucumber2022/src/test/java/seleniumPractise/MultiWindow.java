package seleniumPractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiWindow {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://flipkart.com");

		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();

		WebElement search = driver.findElement(By.cssSelector("input._3704LK"));

		search.sendKeys("Mobiles");

//		Thread.sleep(2000);

		driver.findElement(By.cssSelector("button.L0Z3Pu")).click();

//		search.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();

		String parent = driver.getWindowHandle();

		System.out.println("parent window id is " + parent);
//
//		Set<String> allwindowids = driver.getWindowHandles();
		
//																			Using Iterator
		
//		Iterator<String> it = allwindowids.iterator();
//		
//		String firstID = it.next();
//		
//		if(firstID.equals(parent))
//			System.out.println("This is Parent Window");
//		
//		String secondID = it.next();
//		if(!secondID.equals(parent))
//		{
//			System.out.println("This is not parent ID");
//			
//			driver.switchTo().window(secondID);
//			
//			driver.findElement(By.cssSelector("button._2KpZ6l._2U9uOA._3v1-ww")).click();
//		}
//		
//																	Using count and if condition
//		int count = 0;
//
//		for (String s : allwindowids)
//		{
//			count = count + 1;
//			if (count == 2) {
//				driver.switchTo().window(s);
//				
//				System.out.println("Child window id is"+s);
//
//				driver.findElement(By.cssSelector("button._2KpZ6l._2U9uOA._3v1-ww")).click();
//			}
//		}
		
//																	Using enhanced for loops
//			for(String child:allwindowids)
//			{
//				if(!child.equals(parent))
//				{
//					driver.switchTo().window(child);
//					
//					System.out.println("Child window id is"+child);
//	
//					driver.findElement(By.cssSelector("button._2KpZ6l._2U9uOA._3v1-ww")).click();
//				}
//			}
			
		
//																	COnverting Set to a list
//			List<String> list = new ArrayList<>(allwindowids);
//			
//			driver.switchTo().window(list.get(1));
//			
//			System.out.println("Child window id is"+(list.get(1)));
//			
//			driver.findElement(By.cssSelector("button._2KpZ6l._2U9uOA._3v1-ww")).click();
					
		
		
		List<WebElement> mobiles = driver.findElements(By.xpath("(//div[@class='_4rR01T'])"));
		
		for(int i=0;i<3;i++) {
			
			mobiles.get(i).click();
		}
		
//		Thread.sleep(10000);
		
		Set<String> allid = driver.getWindowHandles();
		
		System.out.println(allid);
		
//		Iterator<String> it = allid.iterator();
//		
//		it.next();
//		
//		it.next();
//		
//		String child = it.next();
//		
//		driver.switchTo().window(child);
//		
//		driver.findElement(By.cssSelector("button._2KpZ6l._2U9uOA._3v1-ww")).click();
		
//		Iterator<String> it = allid.iterator();
//		
//		while(it.hasNext())
//		{
//		String childwindow = it.next();
//		
//		if(!childwindow.equals(parent))
//		{
//			driver.switchTo().window(childwindow);
//			
//			driver.findElement(By.cssSelector("button._2KpZ6l._2U9uOA._3v1-ww")).click();
//		}
//		}
		
		
		
		
//		int count =0;
//		
//		for(String child :allid)
//		{
//			count++;
//			
//			if(count == 2)
//				
//				driver.switchTo().window(child);
//			
////			driver.findElement(By.cssSelector("button._2KpZ6l._2U9uOA._3v1-ww")).click();
//			
//			driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();
//		}
//				

		
		
		Iterator<String> it = allid.iterator();
		
		while(it.hasNext())
		{
		String childwindow = it.next();
		
		WebDriver newwindow = driver.switchTo().window(childwindow);
		
		
		
		if(newwindow.getTitle().contains("SAMSUNG "))
		{
			
			driver.findElement(By.cssSelector("button._2KpZ6l._2U9uOA._3v1-ww")).click();
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		}
	

}
