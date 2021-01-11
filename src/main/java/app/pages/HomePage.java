package app.pages;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class HomePage extends BasePage{

    private ElementsCollection itemsList = $$(By.xpath("//div[@data-testid='generic-product']"));
    private ElementsCollection wishIcons = $$(By.xpath("//div[contains(@class, 'WishlistIcon')]"));

    private SelenideElement searchTextField = $(By.xpath("//input[contains(@class, 'SearchInput')]"));
    private SelenideElement switchButton = $(By.xpath("//button[@data-testid='login_reg_switch_btn']"));
    private SelenideElement registerButton = $(By.xpath("//button[text()='Registrieren']"));
    private SelenideElement loginButton = $(By.xpath("//button[text()='Anmelden']"));
    private SelenideElement switchToLoginButton = $(By.xpath("//button[text()='Hier einloggen']"));
    private SelenideElement email = $(By.name("email"));
    private SelenideElement password = $(By.name("password"));
    private SelenideElement counterIcon = $(By.xpath("//span[@data-testid='wishlist-counter' and text()='1']"));
    private SelenideElement wishListIcon = $(By.cssSelector("svg.icon-wishlist"));

    public HomePage(String endpoint) {
        super(endpoint);
    }

    public void searchForText(String text){
        searchTextField.sendKeys(text);
        searchTextField.pressEnter();
    }

    public void searchItemsListDisplayed(){
        itemsList.shouldHave(sizeGreaterThan(0));
    }

    public void addFirstItemToWishList(){
        wishIcons.get(0).click();
    }

    public void switchToLoginForm(){
        switchToLoginButton.click();
    }

    public void loginWith(String login, String pass){
        email.sendKeys(login);
        password.sendKeys(pass);
        loginButton.click();
    }

    public void wishListCounterHasOneItem(){
        counterIcon.isDisplayed();
    }

    public void openWishListPage(){
        wishListIcon.click();
    }

}
