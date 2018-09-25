import org.openqa.selenium.By;
import pageobject.AccountPage;
import pageobject.AddressList;
import pageobject.LiveChatPage;
import pageobject.ViewProfile;

import java.io.IOException;

public class SubBase extends Base {

    public static String testDataFilePath="C:\\Users\\tariq\\Dropbox\\Amazon\\Buncee\\src\\test\\TestData\\test_data.xlsx";

    //Test Data
    public String userName = readFromExcel(testDataFilePath,"Account","B2");
    public String password = readFromExcel(testDataFilePath,"Account","C2");

    public String emailAddress = readFromExcel(testDataFilePath,"AddressBook","B2");
    public String firstName = readFromExcel(testDataFilePath,"AddressBook","C2");
    public String lastName = readFromExcel(testDataFilePath,"AddressBook","D2");

    public String editFName = readFromExcel(testDataFilePath,"EditProfile","B2");

    public SubBase() throws IOException { }

    public void loginToAccount() throws InterruptedException{
        clickByXpath(AccountPage.loginLinkXpath);
        sendTestByXpath(AccountPage.userNameFieldXpath, userName);
        sendTestByXpath(AccountPage.passwordFieldXpath, password);
        clickByXpath(AccountPage.loginButtonXpath);
        clickByXpath(AccountPage.profileLogoXpath);
        //clickByXpath(AccountPage.profileLogoXpath);
    }


    public void logoutFromAccount() throws InterruptedException {
        //clickByXpath(AccountPage.profileLogoXpath);
        clickByXpath(AccountPage.logoutLinkXpath);
    }

    public void viewProfileFromAccount() throws InterruptedException{
        //clickByXpath(AccountPage.profileLogoXpath);
        clickByXpath(ViewProfile.viewProfileLinkXpath);
        Thread.sleep(3000);

    }


    public void editProfileFromAccount()throws InterruptedException{
        //clickByXpath(AccountPage.profileLogoXpath);
        clickByXpath(ViewProfile.viewProfileLinkXpath);
        clickByXpath(ViewProfile.editLinkXpath);
        sendTestByXpath(ViewProfile.nameLinkXpath,editFName);
        Thread.sleep(3000);
        clickByXpath(ViewProfile.saveLinkXpath);
        Thread.sleep(3000);
    }

    public void editProfileIconFromAccount()throws InterruptedException{
        //clickByXpath(AccountPage.profileLogoXpath);
        clickByXpath(ViewProfile.viewProfileLinkXpath);
        clickByXpath(ViewProfile.editProfileIconLinkXpath);
        Thread.sleep(2000);
        clickByXpath(ViewProfile.newProfileIconLinkXpath);
        Thread.sleep(2000);
        clickByXpath(ViewProfile.saveChangesLinkXpath);
        Thread.sleep(3000);
    }




    public void addAddressToAddressBook() throws InterruptedException {
        //clickByXpath(AccountPage.profileLogoXpath);
        clickByXpath(AddressList.addressBookLinkXpath);
        clickByXpath(AddressList.addEmailXpath);
        sendTestByXpath(AddressList.addEmailXpath, emailAddress);
        sendTestByXpath(AddressList.addFirstNameXpath, firstName);
        sendTestByXpath(AddressList.addLastNameXpath, lastName);
        clickByXpath(AddressList.clickOnAddSigh);
        Thread.sleep(3000);

    }

    public void viewAddressFromAddressBook() throws InterruptedException{
        clickByXpath(AddressList.addressBookLinkXpath);
        clickByXpath(AddressList.clickInSearchFieldXpath);
        sendTestByXpath(AddressList.clickInSearchFieldXpath,firstName);
        Thread.sleep(3000);
    }


    public void removeAddressFromAddressBook() throws InterruptedException{
       // clickByXpath(AccountPage.profileLogoXpath);
        clickByXpath(AddressList.addressBookLinkXpath);
        clickByXpath(AddressList.clickInSearchFieldXpath);
        sendTestByXpath(AddressList.clickInSearchFieldXpath,firstName);
        clickByXpath(AddressList.clickOnRemoveSignXpath);
        Thread.sleep(3000);
    }

    public void liveChatFromSupportPage() throws InterruptedException{
        //clickByXpath(AccountPage.profileLogoXpath);
        clickByXpath(LiveChatPage.viewSupportPageLinkXpath);
        Thread.sleep(3000);
//        clickByXpath(LiveChatPage.clickOnChatNowLinkXpath);
//        clickByXpath(LiveChatPage.clickOnNeedHelpXpath);
//        //Thread.sleep(3000);
//        clickByXpath(LiveChatPage.clickOnNameXpath);
//        sendTestByXpath(LiveChatPage.clickOnNameXpath,"Sanjira Begum");
//        Thread.sleep(3000);
//        clickByXpath(LiveChatPage.clickOnEmailXpath);
//        sendTestByXpath(LiveChatPage.clickOnEmailXpath,"sanjira@gmail.com");
//        Thread.sleep(3000);
//        clickByXpath(LiveChatPage.clickOnChatRoomXpath);
//        sendTestByXpath(LiveChatPage.clickOnChatRoomXpath,"Hi , This is sanjira, \nI need your help");
//        Thread.sleep(3000);
    }

}
