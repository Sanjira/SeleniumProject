import org.testng.annotations.Test;

import java.io.IOException;

public class Support extends SubBase {


    public Support() throws IOException { }

    @Test
    public void liveChat() throws InterruptedException{

        loginToAccount();
        liveChatFromSupportPage();
    }
}

//Not working properly
