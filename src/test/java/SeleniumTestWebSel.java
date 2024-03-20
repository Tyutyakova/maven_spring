import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class SeleniumTestWebSel {

    @Test
    public void testSelen() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

//        String title = driver.getTitle();
//        assertEquals("Web form", title);
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        Thread.sleep(1000);
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        assertEquals("Received!", value);

        driver.quit();
    }

    @Test
    public void testUser() throws InterruptedException {
       WebDriver driver = new ChromeDriver() ;
       driver.get("http://users.bugred.ru/");
       WebElement textBox = driver.findElement(By.name("q"));
       textBox.sendKeys("qwerty");
       Thread.sleep(1000);
       driver.quit();
    }

}


