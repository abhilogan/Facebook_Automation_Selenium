import org.testng.annotations.Test;
import pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest extends BaseTest
{
    private LoginPage loginPage;

    @Test
    public void loginTest() throws InterruptedException {
        String username= "test1234z";
        String lastname = "Dummy1234";
        String mobilenumber = "2365147895";
        String password = "jjgaj@167763";
        String day = "18";
        String month = "6";
        String year = "2016";

        loginPage = new LoginPage(driver);
        loginPage.login(username ,lastname,mobilenumber,password,day,month,year);

        assertThat(driver.getCurrentUrl(),equalTo("https://www.facebook.com/"));

    }

}
