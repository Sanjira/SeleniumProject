import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class AddressBook extends SubBase {


    public AddressBook() throws IOException {}

        @Test(priority = 1, enabled = true)
        public void addAddress() throws Exception {
        loginToAccount();
        addAddressToAddressBook();
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.edu.buncee.com/dashboard#{%22view%22:%22addressbook%22}");
        takeTheScreenshot("AddAddress");
        }

        @Test(priority = 2, enabled = true)
        public void searchAddress()throws Exception{
        loginToAccount();
        viewAddressFromAddressBook();
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.edu.buncee.com/dashboard#{%22view%22:%22addressbook%22}");
        takeTheScreenshot("SearchAddress");
        }

        @Test(priority = 3, enabled = true)
        public void removeAddress() throws Exception{
        loginToAccount();
        removeAddressFromAddressBook();
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.edu.buncee.com/dashboard#{%22view%22:%22addressbook%22}");
        takeTheScreenshot("RemoveAddress");
        }
    }
