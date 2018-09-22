package pageobject;

public class AccountPage {

    //Login
    public static String loginLinkXpath = "/html/body/nav/div[2]/div[1]/a[2]";
    public static String userNameFieldXpath = "//*[@id=\"input-username\"] ";
    public static String passwordFieldXpath = "//*[@id=\"input-password\"] ";
    public static String loginButtonXpath = "//*[@id=\"btn-sign-in\"]";


    // Account Menu
    public static String profileLogoXpath = "//*[@id=\"header-profile-image\"]";
    public static String logoutLinkXpath = "//*[@id=\"reactjs-dashboard-generic\"]/div/div[1]/div[3]/div[4]/div[11]/a";
}
