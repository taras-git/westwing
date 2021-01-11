package app.pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class WishListPage extends BasePage {

    private SelenideElement removeItemFromWish = $(By.xpath("//button[contains(@class, 'blockListProduct__delete')]"));
    private SelenideElement wishListIsEmpty = $(By.xpath("//div[contains(@class, 'wishlistNoProducts')]"));


    public WishListPage(String endpoint) {
        super(endpoint);
    }

    public void deleteItemFromWishList(){
        removeItemFromWish.click();
    }

    public void wishListIsEmpty(){
        wishListIsEmpty.isDisplayed();
    }

}
