package util;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = Config.getDriver();
//        Config.login(driver);

        CookieManager cm = new CookieManager();

        cm.readCookies();

    }
}
