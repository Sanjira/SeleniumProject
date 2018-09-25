import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class EditProfile extends SubBase {

    public EditProfile() throws IOException { }



    @Test(priority = 1, enabled = true)
    public void editName() throws Exception{
        loginToAccount();
        editProfileFromAccount();
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.edu.buncee.com/dashboard#{%22view%22:%22profile%22}");
        takeTheScreenshot("ChangeFName");
    }

    @Test(priority = 2, enabled = true)
    public void editProfileIcon() throws Exception{
        loginToAccount();
        editProfileIconFromAccount();
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.edu.buncee.com/dashboard#{%22view%22:%22profile%22}");
        takeTheScreenshot("ChangeProfileIcon");
    }


//    @Test
//    public void viewProfile() throws InterruptedException{
//        loginToAccount();
//        viewProfileFromAccount();
//    }


}
