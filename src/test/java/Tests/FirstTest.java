package Tests;

import base.BaseTest;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void VerifyTitle() {
        page.navigate("https://google.com/ncr");
        if (page.isVisible("button:has-text('Accept all')")) {
            page.click("button:has-text('Accept all')");
        }
        System.out.println("La pagina fue abierta correctamente");
        System.out.println("El titulo de la pagina es: " + page.title());
    }

//    public static void main(String[] args) {
//
//        try(Playwright playwright = Playwright.create()) {
//            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//            Page page = browser.newPage();
//            page.navigate("https://google.com");
//
//            System.out.println("El titulo de la pagina es: " + page.title());
//            browser.close();
//        }
//    }
}