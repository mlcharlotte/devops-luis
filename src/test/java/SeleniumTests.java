import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTests {

  @Test
public void seleniumTEST () {
    WebDriver driver = new ChromeDriver();
      driver.get("https://www.backmarket.fr");

    driver.quit();



  }


}
