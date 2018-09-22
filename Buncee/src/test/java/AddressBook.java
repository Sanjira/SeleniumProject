import org.testng.annotations.Test;

import java.io.IOException;


public class AddressBook extends SubBase {


    public AddressBook() throws IOException {}

        @Test
        public void addAddress() throws InterruptedException {
            loginToAccount();
        addAddressToAddressBook();

        }

        @Test
        public void removeAddress() throws InterruptedException{
        loginToAccount();
        removeAddressFromAddressBook();
        }
    }
