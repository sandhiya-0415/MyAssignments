package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Assignment 2 for window Handling
public class Window {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Open']")).click();

		// 1.Click and Confirm new Window Opens

		Set<String> newwindow = driver.getWindowHandles();
		List<String> windlist = new ArrayList<String>(newwindow);
		String t = driver.getTitle();
		System.out.println("First Window name:" + t);
		driver.switchTo().window(windlist.get(1));
		String scndwindow = driver.getTitle();
		System.out.println("SecondWindow Title:" + scndwindow);
		// Switching the control to main window
		driver.close();
		driver.switchTo().window(windlist.get(0));

		// 2.Find the number of opened tabs
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		String Primarywindow1 = driver.getWindowHandle();
		Set<String> newwindow1 = driver.getWindowHandles();
		List<String> windlist1 = new ArrayList<String>(newwindow1);
		int size = windlist1.size();
		System.out.println("Number of opened windows when Open Multiple is clicked:" + size);
		for (String handle : newwindow1) {
			if (!handle.equals(Primarywindow1)) {
				driver.switchTo().window(handle);
				driver.close();
			}

		}
		driver.switchTo().window(Primarywindow1);
		// 3.Close all windows except Primary
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		String Primarywindow = driver.getWindowHandle();
		Set<String> newwindow2 = driver.getWindowHandles();
		List<String> windlist2 = new ArrayList<String>(newwindow2);
		int size1 = windlist2.size();
		System.out.println("Number of opened windows when Close Windows is clicked:" + size1);
		for (String handle : newwindow2) {
			if (!handle.equals(Primarywindow)) {
				driver.switchTo().window(handle);
				driver.close();
			}

		}
		driver.switchTo().window(Primarywindow);

		// 4.Wait for 2 new tabs to open
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		String Primarywindow3 = driver.getWindowHandle();
		Set<String> newwindow3 = driver.getWindowHandles();
		List<String> windlist3 = new ArrayList<String>(newwindow3);
		int size2 = windlist3.size();
		System.out.println("Number of opened windows when Open with delay is clicked:" + size2);
		for (String handle : newwindow3) {
			if (!handle.equals(Primarywindow3)) {
				driver.switchTo().window(handle);
				driver.close();
			}

		}

	}

}
