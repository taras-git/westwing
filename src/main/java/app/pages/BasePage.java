package app.pages;

import static com.codeborne.selenide.Selenide.$;

import app.AppConfig;
import app.helpers.Driver;
import app.helpers.Trim;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class BasePage {

    protected String endpoint;

    public SelenideElement acceptCookiesButton = $(By.id("onetrust-accept-btn-handler"));

    public BasePage(String endpoint) {
        this.endpoint = endpoint;
    }

    public void open() {
        String url = Trim.rtrim(AppConfig.baseUrl, "/")
                + "/"
                + Trim.ltrim(endpoint, "/");
        Selenide.open(url);
    }

    public void acceptCookies() {
        acceptCookiesButton.click();
    }

    public void waitForUrlContains(String ulrChunk){
        Driver.waitForUrlContains(ulrChunk);
    }
}
