import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arus {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.exito.com/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='category-menu']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='undefined-nivel2-Tecnología']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='Categorías-nivel2-Televisores']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='Categorías-nivel3-10 a 32 Pulgadas']]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("")).click();
        driver.switchTo().alert().accept();


    }
}
