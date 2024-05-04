import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AppiumBasics extends BaseTest {

    @Test
    public void WifiSettingsName() throws MalformedURLException {
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Preference']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle,"WiFi settings");
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/title' and @text='WiFi settings']")).click();
        driver.findElement(By.id("android:id/edit")).sendKeys("Anjali");
        driver.findElement(By.id("android:id/button2")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/title' and @text='WiFi settings']")).click();
        driver.findElement(By.id("android:id/edit")).sendKeys("Anjali Final");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();

    }
}
