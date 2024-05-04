import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseTest {
    @Test
    public void dragAction() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
        WebElement sourceToBeDragged = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
        dragAction(sourceToBeDragged, 836, 734);
        String resultText = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
        Assert.assertEquals(resultText, "Dropped!");
    }
}
