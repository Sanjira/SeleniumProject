import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AccountFeature extends SubBase {

    public AccountFeature() throws IOException {
    }

    @Test(priority = 1, enabled = true)
    public void login() throws Exception {

        try {
            loginToAccount();
            //System.out.println("Sanjira");

        } catch (Exception e) {
            //takeTheScreenshot("test");
            takeTheScreenshot(new Object() {}.getClass().getEnclosingMethod().getName());

        } finally {

        }

    }


    @Test(priority = 2, enabled = false)
    public void logout() throws InterruptedException {
        loginToAccount();
        logoutFromAccount();
    }



}
