import org.testng.annotations.Test;

import java.io.IOException;

public class EditProfile extends SubBase {

    public EditProfile() throws IOException { }

    @Test
    public void editProfileIcon() throws InterruptedException{
        loginToAccount();
        editProfileIconFromAccount();
    }

    @Test
    public void editName() throws InterruptedException{
        loginToAccount();
        editProfileFromAccount();
    }

//    @Test
//    public void viewProfile() throws InterruptedException{
//        loginToAccount();
//        viewProfileFromAccount();
//    }
//
//    @Test
//    public void editName() throws InterruptedException{
//        loginToAccount();
//        editProfileFromAccount();
//    }

}
