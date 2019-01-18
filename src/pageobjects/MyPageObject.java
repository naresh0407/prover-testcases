package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="NAM_USER"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class, \"windowViewMode-maximized\")]/div/div/div[1]/div/header/div[2]/div/div[2]/ul/li[1]//a")
	public WebElement edit;
			
}
