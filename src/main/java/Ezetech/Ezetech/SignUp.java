package Ezetech.Ezetech;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SignUp {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TH\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
	    driver.get("https://v2-dev.ezewholesale.com/");
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(10, null);
	    
	    driver.findElement(By.cssSelector("path[d=\"M7.58542 6.47342L12.5588 1.50793C12.7074 1.35928 12.791 1.15767 12.791 0.947441C12.791 0.737215 12.7074 0.5356 12.5588 0.386949C12.4101 0.238297 12.2085 0.154785 11.9983 0.154785C11.7881 0.154785 11.5865 0.238297 11.4378 0.386949L6.47233 5.36033L1.50684 0.386949C1.35819 0.238297 1.15657 0.154785 0.946347 0.154785C0.736121 0.154785 0.534506 0.238297 0.385854 0.386949C0.237203 0.5356 0.153691 0.737215 0.153691 0.947441C0.153691 1.15767 0.237203 1.35928 0.385854 1.50793L5.35924 6.47342L0.385854 11.4389C0.311863 11.5123 0.253134 11.5996 0.213056 11.6958C0.172978 11.792 0.152344 11.8952 0.152344 11.9994C0.152344 12.1036 0.172978 12.2068 0.213056 12.303C0.253134 12.3992 0.311863 12.4865 0.385854 12.5599C0.459242 12.6339 0.546553 12.6926 0.642752 12.7327C0.738951 12.7728 0.842133 12.7934 0.946347 12.7934C1.05056 12.7934 1.15374 12.7728 1.24994 12.7327C1.34614 12.6926 1.43345 12.6339 1.50684 12.5599L6.47233 7.58651L11.4378 12.5599C11.5112 12.6339 11.5985 12.6926 11.6947 12.7327C11.7909 12.7728 11.8941 12.7934 11.9983 12.7934C12.1025 12.7934 12.2057 12.7728 12.3019 12.7327C12.3981 12.6926 12.4854 12.6339 12.5588 12.5599C12.6328 12.4865 12.6915 12.3992 12.7316 12.303C12.7717 12.2068 12.7923 12.1036 12.7923 11.9994C12.7923 11.8952 12.7717 11.792 12.7316 11.6958C12.6915 11.5996 12.6328 11.5123 12.5588 11.4389L7.58542 6.47342Z\"]")).click();
	    driver.findElement(By.className("_sign_up")).click();
	    driver.findElement(By.cssSelector("button:contains('Become a Buyer')")).click();
	    driver.findElement(By.xpath("//img[@src='https://storage.googleapis.com/ezetradein-gs-cld/wholesale_1.png']")).click();
	    driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-ncgh6n'] [2]")).click();
	}

}
