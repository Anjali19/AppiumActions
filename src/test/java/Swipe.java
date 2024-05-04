import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Swipe extends BaseTest {

    @Test
    public void swipeAction() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Gallery\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]")).click();
        WebElement firstImage = driver.findElement(By.xpath("//android.widget.ImageView[1]"));
        swipeAction(firstImage, "left");
    }
}
