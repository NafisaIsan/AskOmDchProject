import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.List;

public class NafisaIsangalinaSixthTest {

    @Test
    public void testSixth() {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--remote-along-origins=*", "--headless", "--window-size=1920,1080");
        WebDriver driver = new ChromeDriver();
        driver.get("https://askomdch.com/");

        Assert.assertEquals(driver.getTitle(), "AskOmDch – Become a Selenium automation expert!");

        String textBox = driver.findElement(By.xpath("//h2[@class='has-text-align-center']")).getText();

        Assert.assertEquals(textBox, "Featured Products");

        List<WebElement> products = driver.findElements(By.className("type-product"));

        Assert.assertEquals(products.size(), 5);

        driver.quit();
    }
}


