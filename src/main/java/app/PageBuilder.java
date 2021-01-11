package app;

import app.pages.HomePage;
import app.pages.WishListPage;

public class PageBuilder {
    public static HomePage buildHomePage(){
        return new HomePage("/");
    }

    public static WishListPage buildWishListPage(){
        return new WishListPage("/");
    }

}
