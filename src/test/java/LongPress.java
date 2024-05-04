import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LongPress extends BaseTest {
    @Test
    public void LongPressGesture() {
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();

    }

}
