package app;

import app.pages.HomePage;
import app.pages.WishListPage;

public class App {

    public HomePage homePage;
    public WishListPage wishListPage;

    public App(){
        homePage = PageBuilder.buildHomePage();
        wishListPage = PageBuilder.buildWishListPage();
    }
}
