import app.helpers.UserData;
import helpers.TestData;
import org.testng.annotations.Test;

public class WishListTest extends BaseTest {
    @Test
    public void addToWishListTest() {
        UserData user = new TestData().getCredentials();
        logger.info("User: "+ user.getLogin());

        app.homePage.open();
        app.homePage.acceptCookies();
        app.homePage.searchForText("möbel");
        app.homePage.waitForUrlContains("/moebel/");
        app.homePage.searchItemsListDisplayed();
        app.homePage.addFirstItemToWishList();
        app.homePage.switchToLoginForm();
        app.homePage.loginWith(user.getLogin(), user.getPassword());
        app.homePage.wishListCounterHasOneItem();
        app.homePage.openWishListPage();

        app.wishListPage.waitForUrlContains("/wishlist/");
        app.wishListPage.deleteItemFromWishList();
        app.wishListPage.wishListIsEmpty();
    }
}