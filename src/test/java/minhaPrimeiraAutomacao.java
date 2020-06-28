import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class minhaPrimeiraAutomacao {
    
    @Test
    public void executarCompra(){

        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.xpath("//a[@data-id-product='1']")).click();
    }
}
