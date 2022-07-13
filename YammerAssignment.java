package SeleniumAssignment.com.c;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YammerAssignment {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HMADDILA\\eclipse-workspace-1\\cap.com\\drivers\\chromedriver.exe");

		//instantiate a chromedriver class
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.yammer.com/main/capgemini.com/");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.name("loginfmt")).sendKeys("harika.maddila@capgemini.com");
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(5000);
		WebElement yesButton= driver.findElement(By.xpath("//input[@type='submit']"));
		yesButton.click();
		// with the help of vpn connect we can directly enter into the page
		//driver.findElement(By.xpath("//button[@class='qaModalDialogClose closeButton-589']")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div/div[1]/div[2]/div/div/div/div/nav/div[2]/div/div/div[1]/div[2]/div/div/div/div[2]/ul/li[3]/div/div/div/div/a")).click();
		//click Demo Yammer Assignment
		driver.findElement(By.linkText("Demo Yammer Assignment")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Share thoughts, ideas, or updates')]")).click();

		WebElement content=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div/span/div/div/div/div/div/div/span"));
		content.sendKeys("Hi Welcome to this group");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[5]/div[2]/div/ul/li/div/div/button/span/div")).click();

	}
}

