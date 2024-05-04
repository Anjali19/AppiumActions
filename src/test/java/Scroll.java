import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Scroll extends BaseTest {
    @Test
    public void ScrollTillLast() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
       //exactly know where to scroll
        // driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));

        //used when no idea where element is located
        scrollTillEndAction();
        System.out.println("Scrolled till view is visible ");
    }

}

