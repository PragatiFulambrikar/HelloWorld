package pagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage {
	@FindBy(name="username") private WebElement UsernameTB;
	@FindBy(name="pwd") private WebElement PasswordTB;
	@FindBy(id="loginButton") private WebElement LoginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement LoggedInCheckBox;
	@FindBy(xpath="//a[.='Actimind Inc.']") private WebElement ActiMindLink;
	@FindBy(id="licenseLink") private WebElement LicenseLink;
}
