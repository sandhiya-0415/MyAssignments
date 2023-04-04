package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();

		Driver.get("https://www.leafground.com/drag.xhtml");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Driver.manage().window().maximize();
		// find offset of the Draggable webelement
		WebElement drag1 = Driver.findElement(By.xpath("//div[@class='ui-outputpanel ui-widget']"));
		int x = drag1.getSize().getWidth();
		int y = drag1.getSize().getHeight();
		System.out.println(x + " " + y);

		// Dragging the mouse
		WebElement drag = Driver.findElement(By.xpath("//span [text()='Drag me around']"));
		Actions Builder = new Actions(Driver);
		Builder.dragAndDropBy(drag, 400, 120).perform();

		// droppable target

		WebElement dropsrc = Driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement droptar = Driver.findElement(By.xpath("//p[@class='ui-widget-header']"));
		Builder.dragAndDrop(dropsrc, droptar).perform();
		String s = Driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
		if (s.equals("Dropped!")) {
			System.out.println("Dropped at the target");
		}

		else {
			System.out.println("not dropped as expected");
		}

		// Draggable columns
		WebElement dragsrc = Driver.findElement(By.xpath("//span[text()='Quantity']"));
		WebElement dragtar = Driver.findElement(By.xpath("//span[text()='Category']"));
		Actions B1 = new Actions(Driver);
		B1.dragAndDrop(dragsrc, dragtar).perform();
		if (Driver.findElement(By.xpath("//span[text()='Columns reordered']")).getText().equals("Columns reordered")) {
			System.out.println("Reordered Sucessfully");
		} else
			System.out.println("Not reordered Sucessfully");

		/*
		 * //Draggable Rows WebElement S=Driver.findElement(By.
		 * xpath("//table//tbody[@class='ui-datatable-data ui-widget-content ui-sortable']//tr[2]"
		 * )); WebElement T=Driver.findElement(By.
		 * xpath("//table//tbody[@class='ui-datatable-data ui-widget-content ui-sortable']//tr[3]"
		 * )); Actions B2=new Actions(Driver); B2.dragAndDrop(S,T).perform();
		 * if(Driver.findElement(By.xpath("//span[text()='Row moved']")).getText().
		 * equals("Row moved")) { System.out.println("Rows moved sucessfully"); } else
		 * System.out.println("Rows dragged was not sucessfull");
		 */

		// Resizable image
		WebElement imgsrc = Driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		int x2 = imgsrc.getSize().getWidth();
		int y2 = imgsrc.getSize().getHeight();
		System.out.println(x2 + " " + y2);
		Actions B3 = new Actions(Driver);
		B3.clickAndHold(imgsrc).moveByOffset(100, 0).release().perform();
		// Progress bar
		WebElement startbtn = Driver.findElement(By.xpath("//span[text()='Start']"));
		WebElement cancelbtn = Driver.findElement(By.xpath("//span[text()='Cancel']"));
		startbtn.click();
		Thread.sleep(8000);
		String prgbarvalue = Driver.findElement(By.xpath("//div[@class='ui-progressbar-label']")).getText();
		System.out.println("Progress bar value:" + prgbarvalue);
		cancelbtn.click();
		// slide bar

		WebElement slidebar = Driver
				.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println(slidebar.getSize());
		Actions b4 = new Actions(Driver);
		b4.clickAndHold(slidebar).moveByOffset(25, 0).release().perform();
		WebElement slidebar1 = Driver
				.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
		System.out.println(slidebar1.getSize());
		Actions B4 = new Actions(Driver);
		B4.clickAndHold(slidebar1).moveByOffset(25, 0).release().perform();

		String t = Driver.findElement(By.xpath("//span[@id='form:displayRange']")).getText();
		System.out.println(t);
	}
}
