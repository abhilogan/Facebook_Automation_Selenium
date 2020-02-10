package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.ApplicationProperties;

public class LoginPage extends BasePage {

    @FindBy(name = "firstname")
    private WebElement usernameInput;

    @FindBy(name = "lastname")
    private WebElement lastnameInput;

    @FindBy(id = "u_0_r")
    private  WebElement mobilenumber;

    @FindBy(name = "reg_passwd__")
    private WebElement password;

    @FindBy(name = "birthday_day")
    private WebElement day;

    @FindBy(name = "birthday_month")
    private WebElement month;

    @FindBy(name = "birthday_year")
    private WebElement year;

    @FindBy(id = "u_0_7")
    private  WebElement gender;

    @FindBy(name="websubmit")
    private WebElement loginButton;

    private String url = ApplicationProperties.INSTANCE.getBaseUrl();

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(),this);
        getWebDriver().get(url);
    }

    public void login(String username, String lstname , String mobile ,String pswd , String Bday ,String Bmonth , String Byear) throws InterruptedException {
        usernameInput.sendKeys(username);
        Thread.sleep(1000);

        lastnameInput.sendKeys(lstname);
        Thread.sleep(1000);

        mobilenumber.sendKeys(mobile);
        Thread.sleep(1000);

        password.sendKeys(pswd);
        Thread.sleep(1000);

        Select dropOne=new Select(day);
        dropOne.selectByVisibleText(Bday);
        Thread.sleep(1000);

        Select dropTwo=new Select(month);
        dropTwo.selectByValue(Bmonth);
        Thread.sleep(1000);

        Select dropThree=new Select(year);
        dropThree.selectByVisibleText(Byear);

        Thread.sleep(1000);
        gender.click();

        Thread.sleep(1000);
        loginButton.click();
    }
}
