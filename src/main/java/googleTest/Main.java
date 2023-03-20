

package googleTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {
        // Ne conectam la driverul Chromedescarcat mai devreme

       System.setProperty("webdriver.chrome.driver","c:/chromedriver.exe");
       System.setProperty("webdriver.http.factory","jdk-http-client");
     // Facem un obiect de tip driver
        WebDriver chromedriver = new ChromeDriver();
        chromedriver.manage().window().maximize();

        chromedriver.get("https://www.emag.ro/");
    }
}